package minischeme;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;


public class Evaluator {

  @SuppressWarnings("unchecked")
  public Object eval(final Object expr, final Map<String, Object> env) {
    if (expr instanceof String) {
      return env.get((String) expr);
    }
    else if (! (expr instanceof List)) {
      return expr;
    }

    final var sexpr = (List<Object>) expr;
    final var head = sexpr.get(0);
    final var tail = sexpr.subList(1, sexpr.size());

    if (head.equals("list")) {
      return tail.stream().map(a -> eval(a, env)).collect(toList());
    }
    else if (head.equals("if")) {
      var branch = ((boolean) eval(tail.get(0), env)) ? tail.get(1) : tail.get(2);
      return eval(branch, env);
    }
    else if (head.equals("define")) {
      env.put((String) tail.get(0), eval(tail.get(1), env));
      return null;
    }
    else if (head.equals("lambda")) {
      return new Lambda((List<String>) tail.get(0), (List<Object>) tail.get(1), this, env);
    }
    else if (head.equals("and")) {
      for (var element : tail) {
        if(! (boolean) eval(element, env)){
          return false;
        }
      }
      return true;
    }
    else if (head.equals("not")) {
      return eval( (! (boolean) eval(tail.get(0), env)), env);
    }
    else if (head.equals("eq")){
      for(int i = 1; i < tail.size(); i++) {
        if( (boolean) eval(tail.get(0), env) != (boolean) eval(tail.get(i), env)) {
          return false;
        }
      }
      return true;
    }
    else if (head.equals("head")) {
      return ( (List<Object>) tail.get(0) ).get(0);
    }
    else if (head.equals("tail")) {
      return tail.get(0);
    }
    else if (head.equals("count")) {
      return ( (List<Object>) tail.get(0) ).size();
    }
    else {
      final var proc = (Procedure) eval(head, env);
      if (tail.size() == 0) {
        return proc;
      }
      else {
        final List<Object> args = tail.stream().map(a -> eval(a, env)).collect(toList());
        return proc.call(args);
      }
    }
  }
}

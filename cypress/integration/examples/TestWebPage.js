describe('Tester interface utilisateur', function(){
     it('Visite de la page web', function(){

          cy.visit('localhost:8080')

          cy.contains('Exemple').click()
          cy.contains('addition.minischeme').click()
          cy.contains('Exécuter').click()

          cy.contains('Exemple').click()
          cy.contains('aire-cercle.minischeme').click()
          cy.contains('Exécuter').click()

          cy.contains('Exemple').click()
          cy.contains('compose.minischeme').click()
          cy.contains('Exécuter').click()

          cy.contains('Exemple').click()
          cy.contains('not-liste.minischeme').click()
          cy.contains('Exécuter').click()

          cy.contains('Exemple').click()
          cy.contains('somme-liste.minischeme').click()
          cy.contains('Exécuter').click()

          cy.get('textarea').clear()
          cy.get('.field').type('(* 10 5)')
          cy.contains('Exécuter').click()
          cy.get('.result').should('be','50.0')

          cy.get('textarea').clear()
          cy.get('.field').type('(< 10 5)')
          cy.contains('Exécuter').click()
          cy.get('p.result').should('be', false)

          cy.contains('minischeme').click()
          cy.get('textarea').should('be.empty')



     })
})

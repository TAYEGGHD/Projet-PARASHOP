export class Login {
 
    Navigate(){
        cy.visit('https://www.parashop.tn')

    }

    Client(){
        cy.get('.mobile-top-menu-wrapper > .top-menu > .j-menu > .top-menu-item-1 > a > .links-text').click()
    }

    EnterMail(mail){

        cy.get('#input-email').type(mail)
    }
}
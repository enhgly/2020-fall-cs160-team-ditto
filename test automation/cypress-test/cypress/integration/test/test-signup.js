describe('Testing Sign Up Function', ()=> {
    beforeEach(()=>{
        cy.visit('/signup')
    })
    it('Testing sign up value', ()=> {
        //test fname and lname
        cy.get('#fName').type('fName').should('have.value', 'fName')
        cy.get('#lName').type('lName').should('have.value', 'lName')
        
    })

})
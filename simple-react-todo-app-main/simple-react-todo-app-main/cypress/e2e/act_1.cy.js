describe('My First Test', () => {
  
  it('visits the app', () => {
    cy.visit('http://localhost:3000')
  })
  
  it('finds the title', () => {
    cy.visit('http://localhost:3000')
    cy.screenshot("my-screenshot")
    cy.contains('Todo List')
  })
  
  it('has an input field', () => {
    cy.visit('http://localhost:3000')
    cy.get('[data-cy="todo-input"]').should('be.visible')
  })
  
})
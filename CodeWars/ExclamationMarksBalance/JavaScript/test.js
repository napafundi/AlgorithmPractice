const assert = require('assert')
const solution = require('./solution')

it('correctly returns Right for balance("!!", "??")', () => {
    assert.equal("Right", solution.balance("!!", "??"))
})

it('correctly returns Left for balance("!??","?!!")', () => {
    assert.equal("Left", solution.balance("!??","?!!"))
})

it('correctly returns Left for balance("!?!!","?!?")', () => {
    assert.equal("Left", solution.balance("!?!!","?!?"))
})

it('correctly returns Balance for balance("!!???!????","??!!?!!!!!!!")', () => {
    assert.equal("Balance", solution.balance("!!???!????","??!!?!!!!!!!"))
})
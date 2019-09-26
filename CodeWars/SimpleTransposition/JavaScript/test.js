const assert = require('assert')
const solution = require('./solution')

it('correctly returns "Sml etapetx"', () => {
    assert.equal("Sml etapetx", solution.simpleTransposition("Sample text"))
})

it('correctly returns "Sml rnpstoipetasoiin"', () => {
    assert.equal("Sml rnpstoipetasoiin",
        solution.simpleTransposition("Simple transposition"))
})

it('correctly returns "ko alpbi etwudrgtalnwcl ulcnx ol ih be"', () => {
    assert.equal("ko alpbi etwudrgtalnwcl ulcnx ol ih be",
        solution.simpleTransposition("know call public next would right able"))
})
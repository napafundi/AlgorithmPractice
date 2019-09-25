const assert = require('assert')
const solution = require('./solution')

it("returns 0 for empty array", () => {
    var arr = [];
    assert.equal(0, solution.deepCount(arr));
})

it("returns 3 for simple array", () => {
    var arr = [1, 2, 3];
    assert.equal(3, solution.deepCount(arr));
})

it("returns 4 for simple array with one nested array", () => {
    var arr = ["x", "y", ["z"]];
    assert.equal(4, solution.deepCount(arr));
})

it("returns 7 for array with two nested arrays", () => {
    var arr = [1, 2, [3, 4, [5]]];
    assert.equal(7, solution.deepCount(arr));
})

it("returns 8 for several nested, empty arrays", () => {
    var arr = [[[[[[[[[]]]]]]]]];
    assert.equal(8, solution.deepCount(arr));
})
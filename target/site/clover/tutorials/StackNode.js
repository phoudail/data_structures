var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":372,"methods":[{"el":8,"sc":5,"sl":8},{"el":14,"sc":5,"sl":10},{"el":18,"sc":5,"sl":16},{"el":23,"sc":5,"sl":20},{"el":27,"sc":5,"sl":25}],"name":"StackNode","sl":3},{"el":45,"id":393,"methods":[{"el":39,"sc":5,"sl":36},{"el":44,"sc":5,"sl":41}],"name":"Node","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":20},{"sl":25}],"name":"constrTest","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":26}]},"test_29":{"methods":[{"sl":36}],"name":"addTest","pass":true,"statements":[{"sl":37},{"sl":38}]},"test_3":{"methods":[{"sl":10},{"sl":20},{"sl":25},{"sl":41}],"name":"pushTest","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":21},{"sl":26},{"sl":42},{"sl":43}]},"test_4":{"methods":[{"sl":10},{"sl":16},{"sl":20},{"sl":25},{"sl":41}],"name":"popTest","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":17},{"sl":21},{"sl":22},{"sl":26},{"sl":42},{"sl":43}]},"test_5":{"methods":[{"sl":36}],"name":"removeTest","pass":true,"statements":[{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [4, 3], [4, 3], [4, 3], [4, 3], [], [], [4], [4], [], [], [4, 3, 11], [4, 3, 11], [4, 11], [], [], [4, 3, 11], [4, 3, 11], [], [], [], [], [], [], [], [], [], [5, 29], [5, 29], [5, 29], [], [], [4, 3], [4, 3], [4, 3], [], []]

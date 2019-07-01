var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":277,"methods":[{"el":8,"sc":5,"sl":8},{"el":14,"sc":5,"sl":10},{"el":18,"sc":5,"sl":16},{"el":23,"sc":5,"sl":20},{"el":27,"sc":5,"sl":25}],"name":"StackNode","sl":3},{"el":45,"id":298,"methods":[{"el":39,"sc":5,"sl":36},{"el":44,"sc":5,"sl":41}],"name":"Node","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":20},{"sl":25}],"name":"constrTest","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":26}]},"test_10":{"methods":[{"sl":36}],"name":"removeTest","pass":true,"statements":[{"sl":37},{"sl":38}]},"test_21":{"methods":[{"sl":36}],"name":"addTest","pass":true,"statements":[{"sl":37},{"sl":38}]},"test_25":{"methods":[{"sl":10},{"sl":20},{"sl":25},{"sl":41}],"name":"pushTest","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":21},{"sl":26},{"sl":42},{"sl":43}]},"test_28":{"methods":[{"sl":10},{"sl":16},{"sl":20},{"sl":25},{"sl":41}],"name":"popTest","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":17},{"sl":21},{"sl":22},{"sl":26},{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [25, 28], [25, 28], [25, 28], [25, 28], [], [], [28], [28], [], [], [0, 25, 28], [0, 25, 28], [0, 28], [], [], [0, 25, 28], [0, 25, 28], [], [], [], [], [], [], [], [], [], [10, 21], [10, 21], [10, 21], [], [], [25, 28], [25, 28], [25, 28], [], []]

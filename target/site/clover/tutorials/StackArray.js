var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":346,"methods":[{"el":13,"sc":5,"sl":10},{"el":21,"sc":5,"sl":15},{"el":28,"sc":5,"sl":23},{"el":35,"sc":5,"sl":30},{"el":39,"sc":5,"sl":37}],"name":"StackArray","sl":5},{"el":46,"id":370,"methods":[{"el":45,"sc":5,"sl":45}],"name":"Box","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_20":{"methods":[{"sl":30},{"sl":37}],"name":"constrTest","pass":true,"statements":[{"sl":31},{"sl":34},{"sl":38}]},"test_28":{"methods":[{"sl":15},{"sl":30},{"sl":37},{"sl":45}],"name":"pushTest","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":31},{"sl":32},{"sl":38},{"sl":45}]},"test_30":{"methods":[{"sl":15},{"sl":23},{"sl":30},{"sl":37},{"sl":45}],"name":"popTest","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":20},{"sl":24},{"sl":25},{"sl":26},{"sl":31},{"sl":32},{"sl":34},{"sl":38},{"sl":45}]},"test_39":{"methods":[{"sl":45}],"name":"addTest","pass":true,"statements":[{"sl":45}]},"test_7":{"methods":[{"sl":45}],"name":"removeTest","pass":true,"statements":[{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28, 30], [28, 30], [28, 30], [28], [], [28, 30], [], [], [30], [30], [30], [30], [], [], [], [28, 20, 30], [28, 20, 30], [28, 30], [], [20, 30], [], [], [28, 20, 30], [28, 20, 30], [], [], [], [], [], [], [28, 7, 30, 39], []]

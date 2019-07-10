var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":286,"methods":[{"el":13,"sc":5,"sl":10},{"el":21,"sc":5,"sl":15},{"el":31,"sc":5,"sl":23},{"el":36,"sc":5,"sl":33},{"el":40,"sc":5,"sl":38}],"name":"QueueArray","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_23":{"methods":[{"sl":33},{"sl":38}],"name":"constrTest","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":39}]},"test_39":{"methods":[{"sl":15},{"sl":33},{"sl":38}],"name":"addTest","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":34},{"sl":39}]},"test_7":{"methods":[{"sl":15},{"sl":23},{"sl":33},{"sl":38}],"name":"removeTest","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":20},{"sl":24},{"sl":25},{"sl":26},{"sl":28},{"sl":29},{"sl":34},{"sl":35},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7, 39], [7, 39], [7, 39], [39], [], [7, 39], [], [], [7], [7], [7], [7], [], [7], [7], [], [], [], [7, 23, 39], [7, 23, 39], [7, 23], [], [], [7, 23, 39], [7, 23, 39], [], [], []]

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":112,"id":99,"methods":[{"el":13,"sc":5,"sl":10},{"el":28,"sc":5,"sl":16},{"el":48,"sc":5,"sl":31},{"el":55,"sc":5,"sl":51},{"el":69,"sc":5,"sl":58},{"el":83,"sc":5,"sl":72},{"el":95,"sc":5,"sl":86},{"el":100,"sc":5,"sl":98},{"el":105,"sc":5,"sl":103},{"el":110,"sc":5,"sl":108}],"name":"LinkedList","sl":4},{"el":124,"id":187,"methods":[{"el":120,"sc":5,"sl":120},{"el":122,"sc":5,"sl":122}],"name":"LinkedNode","sl":114}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":16},{"sl":58},{"sl":120}],"name":"getExceptTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":59},{"sl":60},{"sl":120}]},"test_10":{"methods":[{"sl":16},{"sl":86},{"sl":120}],"name":"indexOfTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":94},{"sl":120}]},"test_20":{"methods":[{"sl":16},{"sl":72},{"sl":120}],"name":"setExceptTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":73},{"sl":74},{"sl":120}]},"test_26":{"methods":[{"sl":16},{"sl":31},{"sl":51},{"sl":86},{"sl":98},{"sl":103},{"sl":120}],"name":"removeAllTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":41},{"sl":42},{"sl":52},{"sl":53},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":94},{"sl":99},{"sl":104},{"sl":120}]},"test_29":{"methods":[{"sl":10},{"sl":16},{"sl":31},{"sl":103},{"sl":120}],"name":"sizeTest","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":32},{"sl":44},{"sl":45},{"sl":46},{"sl":104},{"sl":120}]},"test_30":{"methods":[{"sl":16},{"sl":72},{"sl":86},{"sl":103},{"sl":120}],"name":"setTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":73},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":104},{"sl":120}]},"test_32":{"methods":[{"sl":16},{"sl":58},{"sl":103},{"sl":120}],"name":"addTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":25},{"sl":27},{"sl":59},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":104},{"sl":120}]},"test_33":{"methods":[{"sl":16},{"sl":31},{"sl":58},{"sl":86},{"sl":98},{"sl":103},{"sl":120}],"name":"removeTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":45},{"sl":46},{"sl":59},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":94},{"sl":99},{"sl":104},{"sl":120}]},"test_37":{"methods":[{"sl":16},{"sl":86},{"sl":98},{"sl":120}],"name":"containsTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":94},{"sl":99},{"sl":120}]},"test_4":{"methods":[{"sl":16},{"sl":108},{"sl":120}],"name":"isEmptyTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":27},{"sl":109},{"sl":120}]},"test_8":{"methods":[{"sl":16},{"sl":58},{"sl":120}],"name":"getTest","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":59},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":120}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [29], [29], [29], [], [], [], [37, 20, 4, 26, 8, 33, 1, 29, 32, 30, 10], [37, 20, 4, 26, 8, 33, 1, 29, 32, 30, 10], [37, 20, 4, 26, 8, 33, 1, 29, 32, 30, 10], [37, 20, 4, 26, 8, 33, 1, 29, 32, 30, 10], [], [37, 20, 26, 8, 33, 1, 29, 32, 30, 10], [37, 20, 26, 8, 33, 1, 29, 32, 30, 10], [37, 20, 26, 8, 33, 1, 29, 30, 10], [], [37, 20, 26, 8, 33, 1, 29, 32, 30, 10], [], [37, 20, 4, 26, 8, 33, 1, 29, 32, 30, 10], [], [], [], [26, 33, 29], [26, 33, 29], [26, 33], [26, 33], [26, 33], [26, 33], [26, 33], [26, 33], [], [26, 33], [26, 33], [26, 33], [], [33, 29], [33, 29], [33, 29], [], [], [], [], [26], [26], [26], [], [], [], [], [8, 33, 1, 32], [8, 33, 1, 32], [1], [], [8, 33, 32], [8, 33, 32], [8, 33, 32], [8, 33, 32], [8, 33, 32], [], [8, 33, 32], [], [], [], [20, 30], [20, 30], [20], [], [30], [30], [30], [30], [30], [], [30], [], [], [], [37, 26, 33, 30, 10], [37, 26, 33, 30, 10], [37, 26, 33, 30, 10], [37, 26, 33, 30, 10], [37, 26, 33, 30, 10], [37, 26, 33, 30, 10], [37, 26, 33, 30, 10], [], [37, 26, 33, 10], [], [], [], [37, 26, 33], [37, 26, 33], [], [], [], [26, 33, 29, 32, 30], [26, 33, 29, 32, 30], [], [], [], [4], [4], [], [], [], [], [], [], [], [], [], [], [37, 20, 4, 26, 8, 33, 1, 29, 32, 30, 10], [], [], [], []]

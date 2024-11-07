var hljs = new function () {
    function l(o) {
        return o.replace(/&/gm, "&amp;").replace(/</gm, "&lt;").replace(/>/gm, "&gt;");
    }

    function b(p) {
        for (var o = p.firstChild; o; o = o.nextSibling) {
            if (o.nodeName == "CODE") {
                return o;
            }
            if (!(o.nodeType == 3 && o.nodeValue.match(/\s+/))) {
                break;
            }
        }
        return null;
    }

    function h(p, o) {
        return Array.prototype.map.call(p.childNodes, function (q) {
            if (q.nodeType == 3) {
                return o ? q.nodeValue.replace(/\n/g, "") : q.nodeValue;
            }
            if (q.nodeName == "BR") {
                return "\n";
            }
            return h(q, o);
        }).join("");
    }

    function a(q) {
        var p = (q.className + " " + q.parentNode.className).split(/\s+/);
        p = p.map(function (r) {
            return r.replace(/^language-/, "");
        });
        for (var o = 0; o < p.length; o++) {
            if (e[p[o]] || p[o] == "no-highlight") {
                return p[o];
            }
        }
        return null;
    }

    function c(q) {
        var o = [];
        (function p(r, s) {
            for (var t = r.firstChild; t; t = t.nextSibling) {
                if (t.nodeType == 3) {
                    s += t.nodeValue.length;
                } else {
                    if (t.nodeName == "BR") {
                        s += 1;
                    } else {
                        if (t.nodeType == 1) {
                            o.push({
                                event: "start",
                                offset: s,
                                node: t
                            });
                            s = p(t, s);
                            o.push({
                                event: "stop",
                                offset: s,
                                node: t
                            });
                        }
                    }
                }
            }
        })(q, 0);
        return o.length > 0 ? o : null;
    }
};

/*  This is a JavaScript file that contains a set of helper functions for manipulating HTML elements and highlighting code blocks. The functions are encapsulated within an object literal (hljs), which is then used throughout the code.

Here's a brief explanation of the functions defined within the hljs object:

1.
l(o): This function replaces special characters (&, <, >) with their HTML-encoded equivalents (&amp;, &lt;, &gt;).
2.
b(p): This function traverses the child nodes of the provided element (p) and returns the first CODE element encountered. If no CODE element is found, it returns the first non-whitespace text node encountered.
3.
h(p, o): This function recursively traverses the child nodes of the provided element (p) and returns the concatenated text content of all non-whitespace text nodes, optionally removing newline characters if the o parameter is truthy.
4.
a(q): This function extracts the language identifiers from the className attributes of the provided element (q) and its parent element. It then filters out any language identifiers that are already defined in the e object or are equal to "no-highlight".
5.
c(q): This function traverses the child nodes of the provided element (q) and returns an array of objects containing information about the start and stop positions of highlighted code blocks.


In summary, the selected code is a part of a JavaScript file that contains a set of helper functions for manipulating HTML elements and highlighting code blocks. The functions are encapsulated within an object literal (hljs), which is then used throughout the code. The specific functionality of the j(x, v, w) function is not fully defined in the provided code snippet.*/

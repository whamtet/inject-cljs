# inject

Experimental injection of cljs into Chrome repl.

## Usage

1. To build run `scripts/release`.
2. Serve locally `http-server --cors`
3. Create the following snippet in Chrome Devtools

```
var script = document.createElement('script');
script.src = 'http://localhost:8081/release/inject.js';
script.crossOrigin = 'anonymous';
document.head.appendChild(script);
```

4. Eval cljs as follows

```
c(`
(+ 1 2)
`)
```

## Limitations

Clojure namespaces are not yet supported.  To set variables do

```
c(`
(set! js/my-var (+ 1 2))
`)
```

# net.zthc.xtdb

FIXME: description

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    (use 'net.zthc.xtdb.util)
    (binding [*xtdb-node* (your node)]
        (put! {:xt/id         (now-id)
               :foo/bar   "hello xtdb."})
        (put! {:xt/id         :will-be-deleted
               :foo/bar   "hello xtdb."})
        (rm! :will-be-deleted)
        (query '{:find  [(pull e [*])]
                 :where [[e :foo/bar]]})
    )

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2022 ZTHC

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.

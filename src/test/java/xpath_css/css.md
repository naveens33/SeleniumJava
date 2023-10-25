
| CSS Selector           | Description                                                        |
|------------------------|--------------------------------------------------------------------|
| `element`              | Selects all elements of the specified name.                        |
| `.class`               | Selects elements with the specified class attribute.               |
| `#id`                  | Selects an element with the specified id attribute.                |
| `element.class`        | Selects elements of a particular name and class.                   |
| `element#id`           | Selects an element with a specific name and id.                    |
| `element, element`     | Selects multiple elements (comma-separated).                        |
| `element element`      | Selects elements that are descendants of another element.         |
| `element > element`    | Selects elements that are direct children of another element.     |
| `element + element`    | Selects elements that are immediately preceded by another element with the same parent. |
| `:hover`               | Selects elements when the mouse hovers over them.                 |
| `:nth-child(n)`       | Selects elements based on their position within a parent element. |
| `:first-child`         | Selects the first child of its parent.                            |
| `:last-child`          | Selects the last child of its parent.                             |
| `:not(selector)`       | Selects all elements that do not match the given selector.        |
| `[attribute]`          | Selects elements with a specified attribute.                       |
| `[attribute=value]`   | Selects elements with a specified attribute and value.            |
| `[attribute^=value]`  | Selects elements with an attribute value that starts with a specified value. |
| `[attribute$=value]`  | Selects elements with an attribute value that ends with a specified value. |
| `[attribute*=value]`  | Selects elements with an attribute value that contains a specified value. |
| `:nth-of-type(n)`      | Selects elements based on their position among elements of the same type. |
| `:first-of-type`       | Selects the first element of its type within a parent.           |
| `:last-of-type`        | Selects the last element of its type within a parent.            |
| `:only-of-type`        | Selects the only element of its type within a parent.            |
| `:empty`               | Selects elements that have no children.                           |
| `:checked`             | Selects radio buttons or checkboxes that are checked.            |
| `::before`             | Selects the content before an element.                            |
| `::after`              | Selects the content after an element.                             |

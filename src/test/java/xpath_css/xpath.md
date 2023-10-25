XPath, or XML Path Language, is a powerful and flexible language for navigating XML and HTML documents. There are two main types of XPath expressions:

1. **Absolute XPath**:

    - An absolute XPath specifies the location of an element from the root node of the document. It starts with a single forward slash `/`.
    - It provides the full path to the element, making it less resilient to changes in the document structure.
    - An example of an absolute XPath: `/html/body/div[1]/a`.

2. **Relative XPath**:

    - A relative XPath specifies the location of an element relative to another element in the document.
    - It typically starts with a double forward slash `//`, which allows you to select elements from anywhere in the document.
    - Relative XPaths are more flexible and less likely to break when the document structure changes.
    - An example of a relative XPath: `//div[@class='example']//a`.

Besides the differentiation between absolute and relative XPaths, XPath expressions can be categorized into several types based on their usage and the context in which they are employed:

3. **Node Selection**:

    - These XPath expressions are used to select specific nodes in the document, such as elements, attributes, or text nodes.
    - Example: `//a` to select all anchor elements in the document.

4. **Attribute Selection**:

    - These expressions are used to select elements based on their attributes.
    - Example: `//input[@type='text']` to select input elements with a type attribute of "text."

5. **Text Selection**:

    - These expressions are used to select elements based on their text content.
    - Example: `//p[text()='Hello, world!']` to select paragraphs with the exact text content "Hello, world!"

7. **Functions**:

    - XPath supports various functions that can be used in expressions. These functions provide additional flexibility for element selection and attribute manipulation.
    - Example: `//a[starts-with(@href, 'https://')]` to select anchor elements whose "href" attribute starts with "https://."

8. **Positional Selection**:

    - You can select elements based on their position within a set of elements. For example, selecting the first or last element.
    - Example: `(//h2)[1]` to select the first `<h2>` element in the document.

| XPath Expression                          | Description                                      |
|------------------------------------------|--------------------------------------------------|
| `/`                                      | Selects the root node.                          |
| `element`                                | Selects all elements of the specified name.      |
| `//element`                              | Selects all elements of the specified name anywhere in the document. |
| `@attribute`                            | Selects the specified attribute of the current element. |
| `//element[@attribute='value']`         | Selects elements with a specific attribute value. |
| `//element[text()='text']`               | Selects elements with specific text content. |
| `//element[@attribute1='value1' and @attribute2='value2']` | Selects elements with multiple attributes. |
| `//element[@attribute='value']/child`    | Selects child elements of specific parent elements. |
| `//parent/child`                        | Selects child elements with a specific parent. |
| `//element[position()]`                  | Selects elements by their position in the document. |
| `//element[last()]`                     | Selects the last element of a specified name. |
| `//element[contains(@attribute, 'value')]` | Selects elements with an attribute containing a specific value. |
| `//element[starts-with(@attribute, 'value')]` | Selects elements with an attribute that starts with a specific value. |
| `//element[not(@attribute)]`            | Selects elements without a specific attribute. |
| `//element[@attribute1='value' or @attribute2='value']` | Selects elements with one of multiple attributes. |

### XPath axes:

| XPath Axis                | Description                                                                                                               |
|---------------------------|---------------------------------------------------------------------------------------------------------------------------|
| `child::`                 | Selects elements that are direct children of the current context node.                                                  |
| `descendant::`            | Selects elements that are descendants of the current context node, regardless of their level in the hierarchy.        |
| `parent::`                | Selects the parent of the current context node.                                                                          |
| `ancestor::`              | Selects all ancestors of the current context node, moving up the hierarchy.                                              |
| `following-sibling::`     | Selects elements that are siblings following the current context node.                                                   |
| `preceding-sibling::`     | Selects elements that are siblings preceding the current context node.                                                   |
| `following::`             | Selects all elements in the document that come after the current context node, regardless of their hierarchy.         |
| `preceding::`             | Selects all elements in the document that come before the current context node, regardless of their hierarchy.         |

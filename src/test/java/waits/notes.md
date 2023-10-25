
**Implicit Wait**:

- An implicit wait is a global setting for the WebDriver.
- It instructs the WebDriver to wait for a specified maximum amount of time for an element to be found before throwing an exception.
- The implicit wait is applied to all elements and operations in the WebDriver session until it is changed or the session ends.
- Useful when you expect elements to load or change across various parts of your script.

**Explicit Wait**:

- An explicit wait allows you to set a custom condition and a maximum wait time for a specific element.
- It is more granular and flexible compared to implicit waits and can be applied to specific elements or actions.
- You can use custom conditions defined in the `ExpectedConditions` class, such as waiting for an element to be clickable, visible, or to have specific text.
- Helpful in scenarios where you need to wait for a specific condition to be met before proceeding with your script.

**Fluent Wait**:

- A Fluent Wait is an advanced version of explicit wait, offering more control and flexibility.
- You can set the polling interval (how often Selenium checks for the condition) and specify exceptions to ignore during the wait.
- Useful when dealing with complex situations or conditions that require a custom approach to waiting.
- Allows you to create more complex waiting strategies to handle specific synchronization issues.

### ExpectedConditions

| ExpectedCondition                    | Description                                           |
|-------------------------------------|-------------------------------------------------------|
| `alertIsPresent()`                   | Waits for an alert dialog to be present.             |
| `elementToBeClickable(locator)`     | Waits for an element to be clickable.                |
| `elementToBeSelected(WebElement element)` | Waits for an element to be selected (e.g., a checkbox). |
| `frameToBeAvailableAndSwitchToIt(locator)` | Waits for a frame to be available and switches to it. |
| `invisibilityOfElementLocated(locator)` | Waits for an element to become invisible.          |
| `invisibilityOfElementWithText(locator, text)` | Waits for an element with text to become invisible.  |
| `presenceOfAllElementsLocatedBy(locator)` | Waits for all elements matching the locator to be present. |
| `presenceOfElementLocated(locator)`   | Waits for an element matching the locator to be present. |
| `textToBePresentInElement(element, text)` | Waits for specific text to be present in an element. |
| `textToBePresentInElementLocated(locator, text)` | Waits for specific text to be present in an element located by the locator. |
| `titleIs(title)`                     | Waits for the title of the web page to be a specific value. |
| `titleContains(partialTitle)`        | Waits for the title of the web page to contain a specific value. |
| `visibilityOf(element)`              | Waits for an element to become visible.               |
| `visibilityOfElementLocated(locator)` | Waits for an element located by the locator to become visible. |
| `visibilityOfElementLocatedBy(locator)` | Waits for an element located by the locator to become visible. |
| `numberOfElementsToBe(locator, expectedCount)` | Waits for a specific number of elements to be present. |
| `stalenessOf(element)`               | Waits for an element to become stale (removed from the DOM). |
| `elementSelectionStateToBe(element, selected)` | Waits for the selected state of an element.  |


[Example](notes.md)
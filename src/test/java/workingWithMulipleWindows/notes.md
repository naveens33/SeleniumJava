Switch between multiple windows (browser tabs or separate browser windows) using the `getWindowHandles`, `switchTo().window(handle)`, and `getWindowHandle` methods. Here's how you can use these methods to work with multiple windows:

1. **`getWindowHandles()` Method**:

    - `getWindowHandles()` returns a set of unique identifiers (window handles) for all open windows or tabs.
    - You can use this method to get a list of all currently open windows or tabs.

   ```java
   Set<String> windowHandles = driver.getWindowHandles();
   ```

2. **`switchTo().window(handle)` Method**:

    - `switchTo().window(handle)` is used to switch to a specific window by providing its handle.
    - You can loop through the window handles to switch between different windows.

   ```java
   for (String windowHandle : driver.getWindowHandles()) {
       driver.switchTo().window(windowHandle);
       // Perform actions in the currently switched window
   }
   ```

3. **`getWindowHandle()` Method**:

    - `getWindowHandle()` returns the window handle of the currently focused window.
    - You can use this method to keep track of which window you are currently working with.

   ```java
   String currentWindowHandle = driver.getWindowHandle();
   ```

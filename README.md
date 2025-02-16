# Java Uncommon Bug: Masking Exception in Finally Block

This repository demonstrates an uncommon bug in Java related to exception handling and the `finally` block.  The code example shows how modifying a variable within the `finally` block after an exception can potentially mask the original exception, making debugging more difficult.  The solution provides an alternative approach to avoid this issue.

The bug involves a division by zero (`ArithmeticException`) that is caught. However, the divisor is modified within the `finally` block, causing the subsequent division to succeed, seemingly hiding the original problem.  This makes it less obvious that an exception occurred earlier.

This example highlights the importance of careful consideration when modifying variables in `finally` blocks, especially those involved in exception-prone operations. Always aim to handle exceptions transparently so they don't get masked unexpectedly.
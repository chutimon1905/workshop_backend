# workshop-java-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
* TC01 => 1 commit
 write A B C to buffer should read A B C from buffer()
* TC02 => 1 commit
write A B C D to buffer should read A B C D from buffer()
* TC03 => 1 commit
write A B C D E to buffer should read A B C D E from buffer()
* TC04 => 1 commit
write A B C D E F to buffer should read A B C D E F from buffer()
* TC05 => 1 commit
write A B C D E F G to buffer should read A B C D E F G from buffer()

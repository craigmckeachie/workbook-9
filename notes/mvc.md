# MVC Notes

- [Simple Controller Example](https://github.com/craigmckeachie/workbook-9/blob/main/demo.api/src/main/java/com/pluralsight/demo/api/controller/AuthorController.java)
---

If dealing with id use path variable, otherwise use requestparam

## Path Variables

PathVariable: 
- use for id
- come after a slash
- they don’t have a name when passed in url just a value
- they are usually required or an error will occur
    - doesn't make sense to find "nothing"


    ```Java
        // http://localhost:8080/authors/5
        @GetMapping(path = "/authors/{id}")
        public Author find(@PathVariable int id){
            Author author = new Author(id, "J.K.", "Rowling");
            return author;
        }

    ```


## Request Parameters

RequestParam:
 - come after ?
 -  there can be many
 -  they can be optional

```Java
   http://localhost:8080/authors?lastName="Rowling" 
   @GetMapping(path = "/authors")
   public Author find(@RequestParam string lastName){
       Author author = new Author(5, "J.K.", "Rowling");
       return author;
   }
```





async function task1(){
    //  console.log("Task 1 ");//undefined
    return "Task 1" ;
     
}

async function task2(){
    // console.log("Task 2");
    return "Task 2 " ;
    
}

async function task3() {
    // console.log("Task 3");
    return "Task 3" ;
    
}

const res = await Promise.all([task1(),task2(),task3()]) ;
console.log(res);





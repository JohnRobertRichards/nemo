
refresh();

function refresh() {
    fetch("/list")
        .then(response => response.json())
        .then(data => {
            const todolist = data;

            let innerHtml = ``;
            
            todolist.forEach(todo => {
                innerHtml += `
                <div class="todo-item">
                    <span>${todo.name}</span>
    
                    <button onclick="javascript:remove('${todo.name}');" class="float-right btn btn-danger btn-sm">
                        <i class="fa fa-trash"></i>
                    </button>
                </div>
                `
            });
            
            document.querySelector("#todolist").innerHTML = innerHtml;
        });
}

function register() {
    const requestData = { "name": document.querySelector("#new_name").value };

    fetch("/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(requestData),
    }).then(refresh);
}

function remove(name) {
    const requestData = { "name": name };

    fetch("/remove", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(requestData),
    }).then(refresh);
}

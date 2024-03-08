<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Example Page</title>
</head>
<body>
    <h1>Welcome, ${username}!</h1>

    <p>Total Cost: ${quantity * price}</p>

    <#if isAdmin>
        <p>Welcome, admin!</p>
    <#else>
        <p>Welcome, user!</p>
    </#if>

    <ul>
        <#list fruits as name>
            <li>${name}</li>
        </#list>
    </ul>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/22/2023
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Failed</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,300;0,700;1,100;1,200;1,700&family=Quicksand:wght@300;400;500;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<section class="flex items-center h-full p-16 dark:bg-gray-900 dark:text-gray-100">
    <div class="container flex flex-col items-center justify-center px-5 mx-auto my-8">
        <img class="" src="https://media.licdn.com/dms/image/C560BAQEl6a9tUkSKfg/company-logo_200_200/0/1558604414993?e=2147483647&v=beta&t=liCSw94UkEjwbMZZh8N23ZMYixEAMmZNq2IftvsF97Y" />
        <div class="max-w-md text-center">
            <h2 class="mb-8 font-extrabold text-9xl text-[#29375a]">
                <span class="sr-only text-[#29375a]">Error</span>404
            </h2>
            <p class="text-2xl font-semibold md:text-3xl text-[#29375a]">{$exception}</p>
            <a rel="noopener noreferrer" href="http://localhost:8090/demo_war_exploded/" class="px-8 py-3 font-semibold rounded dark:bg-violet-400 dark:text-gray-900">Home Page</a>
        </div>
    </div>
</section>
</body>
</html>

function fn() {
    var env = karate.env;
    karate.log('karate.env system property was:', env);

    var config = {
        baseUrl: 'https://api.demoblaze.com'
    }

    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);

    if (env == 'dev') {
        config.baseUrl = 'http://dev.api.example.com'
    } else if (env == 'qa') {
        config.baseUrl = 'http://api.example.com'
    }

    return config;
}

# Edit Mode Anywhere URL Override
This is a drop in replacement for the dotCMS EMA capibility.  The difference is that this plugin allows individual developers to override the proxy url of edit mode by passing a query string.  The changed proxy url is stored in the developers session.  When the ability to override the proxy url is combined with a tool like ngrok, which exposes a port on the developers computer as a url, it can allow multiple remote developers to develop their client side SPA and applications locally and preview them against the content stored on a central dev dotCMS instance.



# How to use

To set a new EMA proxy url, use:
http://localhost:8080/dotAdmin/#/edit-page/content?url=%2Ftest&language_id=1&host_id=8a7d5e23-da1e-420a-b4f0-471e7da8ea2d&proxyEditModeURL=http://newproxyurl:3000

To unset, just send the proxyEditModeURL empty

http://localhost:8080/dotAdmin/#/edit-page/content?url=%2Ftest&language_id=1&host_id=8a7d5e23-da1e-420a-b4f0-471e7da8ea2d&proxyEditModeURL=

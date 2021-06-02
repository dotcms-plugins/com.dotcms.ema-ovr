# com.dotcms.ema-ovr
This is version of EMA, allows a developer to override the proxy url by query string.  When the ability to override the proxy url is combined with a tool like ngrok, it can allow multiple remote developers to develop their SPAs and applications locally against the a central dev dotCMS instance.



# How to use

To set a new EMA proxy url, use:
http://localhost:8080/dotAdmin/#/edit-page/content?url=%2Ftest&language_id=1&host_id=8a7d5e23-da1e-420a-b4f0-471e7da8ea2d&proxyEditModeURL=http://newproxyurl:3000

To unset, just send the proxyEditModeURL empty

http://localhost:8080/dotAdmin/#/edit-page/content?url=%2Ftest&language_id=1&host_id=8a7d5e23-da1e-420a-b4f0-471e7da8ea2d&proxyEditModeURL=

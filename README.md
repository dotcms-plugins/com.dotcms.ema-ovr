# com.dotcms.ema-ovr
This is version of EMA, allows to override the proxy url by query string

#uses

To set the new proxy url, use:
http://localhost:8080/dotAdmin/#/edit-page/content?url=%2Ftest&language_id=1&host_id=8a7d5e23-da1e-420a-b4f0-471e7da8ea2d&proxyEditModeURL=newproxyurl:8080

To unset, just send the proxyEditModeURL empty

http://localhost:8080/dotAdmin/#/edit-page/content?url=%2Ftest&language_id=1&host_id=8a7d5e23-da1e-420a-b4f0-471e7da8ea2d&proxyEditModeURL=

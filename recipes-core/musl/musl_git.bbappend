PROVIDES:remove = "${@bb.utils.contains('PREFERRED_PROVIDER_virtual/libiconv', 'musl', '', 'virtual/libiconv', d)}"

#PROVIDES:remove = "virtual/libiconv"

do_install:append () {
    if [ "${@bb.utils.contains('PREFERRED_PROVIDER_virtual/libiconv', 'musl', 'true', 'false', d)}" = "false" ]; then
        mv ${D}${includedir}/iconv.h ${D}${includedir}/iconv-musl.h
    fi
}

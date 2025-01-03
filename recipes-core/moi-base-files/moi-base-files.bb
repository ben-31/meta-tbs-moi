SUMMARY = "TBS base files"

SRC_URI = "file://interfaces \
           file://network \
           file://linuxrc"

LICENSE = "CLOSED"

do_configure[noexec] = "1"

do_compile[noexec] = "1"


do_install () {
    install -d "${D}/${sysconfdir}/init.d" \
        "${D}/${sysconfdir}/network" \
        "${D}/${sysconfdir}/rcS.d" \
        "${D}/${sysconfdir}/rc5.d"

    install -D -m 0644 "${WORKDIR}/interfaces" "${D}/${sysconfdir}/network/interfaces"
    install -D -m 0755 "${WORKDIR}/network" "${D}/${sysconfdir}/init.d/network"
    install -D -m 0755 "${WORKDIR}/linuxrc" "${D}/linuxrc"
    ln -sf ../init.d/mdev ${D}/${sysconfdir}/rcS.d/S10mdev
    ln -sf ../init.d/syslog ${D}/${sysconfdir}/rc5.d/S10syslog
    ln -sf ../init.d/network ${D}/${sysconfdir}/rc5.d/S20network
    ln -sf ../init.d/dropbear ${D}/${sysconfdir}/rc5.d/S30dropbear
}

FILES:${PN} += "/linuxrc"

RDEPENDS:${PN} += "ifupdown"
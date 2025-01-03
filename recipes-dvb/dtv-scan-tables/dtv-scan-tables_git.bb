SUMMARY = "Digital TV scan tables"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
                    file://COPYING.LGPL;md5=a980bc75ad67cf0f6ae844be7ba8fb2d"

SRC_URI = "git://git.linuxtv.org/dtv-scan-tables.git;protocol=https;branch=master \
	       file://fr-Toulouse;subdir=git/dvb-t"

PV = "1.0+git"
SRCREV = "7098bdd27548eaf3e5d9485fc68575f88e362daf"

inherit allarch

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DATADIR=${D}/${datadir} DVBV5DIR=dvb"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install () {
	oe_runmake install
}

FILES:${PN} = "${datadir}/dvb"

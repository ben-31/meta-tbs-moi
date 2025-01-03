FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI = "git://github.com/tvheadend/tvheadend.git;branch=master;protocol=https \
           file://0001-RAND_seed-commented-out.patch"
SRCREV = "653bd0400b4413db96b80c807f0f7524f9248adb"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=4d88651adbf587ba207e620d5e271672"
DEPENDS += "libiconv"
EXTRA_OECONF += "--enable-libiconv"
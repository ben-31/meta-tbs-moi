# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPL-2.0-only & LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
                    file://COPYING.LGPL;md5=a980bc75ad67cf0f6ae844be7ba8fb2d"

SRC_URI = "git://git.linuxtv.org/dtv-scan-tables.git;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "7098bdd27548eaf3e5d9485fc68575f88e362daf"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DATADIR=${D}/${datadir} DVBV5DIR=dvb"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	:
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install
}

FILES:${PN} = "${datadir}/dvb"
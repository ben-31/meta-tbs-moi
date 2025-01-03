SUMMARY = "A small image just capable of allowing a device to boot."

LICENSE = "MIT"

IMAGE_INSTALL = "\
    packagegroup-base \
    packagegroup-core-boot \
    moi-base-files \
    ntpdate \
    ifupdown \
    gerbera \
    tvheadend \
    ffmpeg \
    dtv-scan-tables \
    tzdata \
    ${CORE_IMAGE_EXTRA_INSTALL}\
    "

IMAGE_FEATURES = "ssh-server-dropbear debug-tweaks serial-autologin-root package-management"

IMAGE_LINGUAS ?= ""

inherit core-image

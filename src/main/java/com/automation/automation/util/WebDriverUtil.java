package com.automation.automation.util;


import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;


import com.automation.automation.logging.Logger;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class WebDriverUtil {

    private static AtomicReference<OSType> detectedOS = new AtomicReference<>(null);
    private static final String X64_ARCH = "amd64";
    private static final String OS_ARCH = "os.arch";
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

    public static void setDriverAccordingToOS() {
        final OSType operatingSystemType = getOperatingSystemType();
        switch (operatingSystemType) {
            case WINDOWS:
                setChromeDriverWindows();
                break;
            case MACOS:
                setChromeDriverOsx();
                break;
            case LINUX:
                setChromeDriverLinux();
                break;
            default:
                Logger.out.error("OS is no defined");
        }
    }

    private static void setChromeDriverLinux() {
        if (X64_ARCH.equals(System.getProperty(OS_ARCH))) {
            System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/linux/64bit/chromedriver");
        } else {
            System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/linux/32bit/chromedriver");
        }
    }

    private static void setChromeDriverWindows() {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/windows/chromedriver.exe");
    }

    private static void setChromeDriverOsx() {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/osx/chromedriver");
    }


    public enum OSType {
        WINDOWS,
        MACOS,
        LINUX,
        OTHER
    }

    public static OSType getOperatingSystemType() {
        if (detectedOS.get() == null) {
            String operationSystem = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (operationSystem.indexOf("mac") >= 0 || operationSystem.indexOf("darwin") >= 0) {
                detectedOS.compareAndSet(null, OSType.MACOS);
            } else if (operationSystem.indexOf("win") >= 0) {
                detectedOS.compareAndSet(null, OSType.WINDOWS);
            } else if (operationSystem.indexOf("nux") >= 0) {
                detectedOS.compareAndSet(null, OSType.LINUX);
            } else {
                detectedOS.compareAndSet(null, OSType.OTHER);
            }
        }
        return detectedOS.get();
    }

    public static void setBaseUrl(final String url) {
        ThucydidesWebDriverSupport.getPages().getConfiguration().setDefaultBaseUrl(url);
    }

}

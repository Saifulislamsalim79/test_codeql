package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class AttributeValidatorUtils {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])", 2);
    private static final Pattern VALID_WEBSITE_REGEX = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\u200c\u200b\\w]{2,63}/?$");
    private static final Pattern VALID_NUMBER_REGEX = Pattern.compile("^[-+]?\\d+$");
    private static final Pattern VALID_FLOAT_REGEX = Pattern.compile("^[-+]?\\d*\\.?\\d*$");

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AttributeResponseCode {
        public static final int INVALID_COUNTRY_CODE = 6;
        public static final int INVALID_EMAIL = 2;
        public static final int INVALID_NUMBER = 3;
        public static final int INVALID_NUMBER_HAS_TOO_MANY_DIGITS = 5;
        public static final int INVALID_NUMBER_NEEDS_PREFIX = 4;
        public static final int INVALID_NUMBER_NOT_ENOUGH_DIGITS = 7;
        public static final int INVALID_STRING = 1;
        public static final int TYPE_DIALOG = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int validateAttribute(String str, String str2) {
        char c;
        switch (str2.hashCode()) {
            case -1034364087:
                if (str2.equals(AttributeType.NUMBER)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 75849770:
                if (str2.equals(AttributeType.WEBSITE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96619420:
                if (str2.equals("email")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (str2.equals(AttributeType.FLOAT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 106642798:
                if (str2.equals(AttributeType.PHONE)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return VALID_EMAIL_ADDRESS_REGEX.matcher(str).matches() ? 0 : 2;
        } else if (c != 1) {
            if (c == 2) {
                return VALID_NUMBER_REGEX.matcher(str).matches() ? 0 : 3;
            } else if (c == 3) {
                return VALID_FLOAT_REGEX.matcher(str).matches() ? 0 : 3;
            } else if (c != 4) {
                return 0;
            } else {
                return PhoneNumberValidator.validatePhoneNumber(str);
            }
        } else {
            return !VALID_WEBSITE_REGEX.matcher(str).matches();
        }
    }
}

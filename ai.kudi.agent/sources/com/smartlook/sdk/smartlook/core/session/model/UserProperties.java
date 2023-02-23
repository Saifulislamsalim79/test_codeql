package com.smartlook.sdk.smartlook.core.session.model;

import e.a.a.a.f.u.g;
import java.util.Date;
import java.util.Set;
import kotlin.C13287o;
import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b0\u00101J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\bJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0005J\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\bJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0005J\u001d\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\u0005J\u001d\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005J\u001d\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bJ\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J'\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/¨\u00065"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "Le/a/a/a/f/u/g;", "", UserProperties.DESCRIPTION_KEY, "putDescription", "(Ljava/lang/String;)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "", "immutable", "(Ljava/lang/String;Z)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "email", "putEmail", UserProperties.FAX_KEY, "putFax", UserProperties.NAME_KEY, "putName", "phone", "putPhone", UserProperties.WEBSITE_KEY, "putWebsite", "", UserProperties.AGE_KEY, "putAge", "(I)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "(IZ)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "Ljava/util/Date;", UserProperties.BIRTHDAY_KEY, "putBirthday", "(Ljava/util/Date;)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "(Ljava/util/Date;Z)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", UserProperties.GENDER_KEY, "putGender", "title", "putTitle", "username", "putUsername", UserProperties.COMPANY_KEY, "putCompany", UserProperties.INDUSTRY_KEY, "putIndustry", "Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties$Address;", "address", "putAddress", "(Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties$Address;)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "key", "", "value", "put", "(Ljava/lang/String;Ljava/lang/Object;Z)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties;", "<init>", "()V", "Companion", "Address", "a", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class UserProperties extends g {
    private static final String AGE_KEY = "age";
    private static final String BIRTHDAY_KEY = "birthday";
    private static final String COMPANY_KEY = "company";
    public static final C7232a Companion = new C7232a(null);
    private static final String DESCRIPTION_KEY = "description";
    private static final String EMAIL_KEY = "email";
    private static final String FAX_KEY = "fax";
    private static final String GENDER_KEY = "gender";
    private static final String INDUSTRY_KEY = "industry";
    private static final String NAME_KEY = "name";
    private static final String PHONE_KEY = "phone";
    private static final String TITLE_KEY = "title";
    private static final String USERNAME_KEY = "username";
    private static final String WEBSITE_KEY = "website";

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006#"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties$Address;", "Le/a/a/a/f/u/g;", "", Address.ADDRESS_CITY_KEY, "putCity", "(Ljava/lang/String;)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties$Address;", "countryKey", "putCountryKey", "postalCole", "putPostalCode", "state", "putState", Address.ADDRESS_STREET_KEY, "putStreet", "", "component1", "()Z", "immutable", "copy", "(Z)Lcom/smartlook/sdk/smartlook/core/session/model/UserProperties$Address;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getImmutable", "<init>", "(Z)V", "Companion", "a", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* loaded from: classes2.dex */
    public static final class Address extends g {
        private static final String ADDRESS_CITY_KEY = "city";
        private static final String ADDRESS_COUNTRY_KEY = "country";
        private static final String ADDRESS_POSTAL_CODE_KEY = "postalCode";
        private static final String ADDRESS_STATE_KEY = "state";
        private static final String ADDRESS_STREET_KEY = "street";
        public static final C7231a Companion = new C7231a(null);
        private final boolean immutable;

        @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003¨\u0006\n"}, m10421d2 = {"com/smartlook/sdk/smartlook/core/session/model/UserProperties$Address$a", "", "ADDRESS_CITY_KEY", "Ljava/lang/String;", "ADDRESS_COUNTRY_KEY", "ADDRESS_POSTAL_CODE_KEY", "ADDRESS_STATE_KEY", "ADDRESS_STREET_KEY", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
        /* renamed from: com.smartlook.sdk.smartlook.core.session.model.UserProperties$Address$a */
        /* loaded from: classes2.dex */
        public static final class C7231a {
            private C7231a() {
            }

            public /* synthetic */ C7231a(kotlin.e0.d.g gVar) {
                this();
            }
        }

        public Address() {
            this(false, 1, null);
        }

        public Address(boolean z) {
            this.immutable = z;
        }

        public static /* synthetic */ Address copy$default(Address address, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = address.immutable;
            }
            return address.copy(z);
        }

        public final boolean component1() {
            return this.immutable;
        }

        public final Address copy(boolean z) {
            return new Address(z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Address) && this.immutable == ((Address) obj).immutable;
            }
            return true;
        }

        public final boolean getImmutable() {
            return this.immutable;
        }

        public int hashCode() {
            boolean z = this.immutable;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final Address putCity(String str) {
            l.f(str, ADDRESS_CITY_KEY);
            super.putValue(ADDRESS_CITY_KEY, str, this.immutable);
            return this;
        }

        public final Address putCountryKey(String str) {
            l.f(str, "countryKey");
            putValue(ADDRESS_COUNTRY_KEY, str, this.immutable);
            return this;
        }

        public final Address putPostalCode(String str) {
            l.f(str, "postalCole");
            putValue(ADDRESS_POSTAL_CODE_KEY, str, this.immutable);
            return this;
        }

        public final Address putState(String str) {
            l.f(str, "state");
            putValue("state", str, this.immutable);
            return this;
        }

        public final Address putStreet(String str) {
            l.f(str, ADDRESS_STREET_KEY);
            putValue(ADDRESS_STREET_KEY, str, this.immutable);
            return this;
        }

        public String toString() {
            return "Address(immutable=" + this.immutable + ")";
        }

        public /* synthetic */ Address(boolean z, int i, kotlin.e0.d.g gVar) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0003¨\u0006\u0012"}, m10421d2 = {"com/smartlook/sdk/smartlook/core/session/model/UserProperties$a", "", "AGE_KEY", "Ljava/lang/String;", "BIRTHDAY_KEY", "COMPANY_KEY", "DESCRIPTION_KEY", "EMAIL_KEY", "FAX_KEY", "GENDER_KEY", "INDUSTRY_KEY", "NAME_KEY", "PHONE_KEY", "TITLE_KEY", "USERNAME_KEY", "WEBSITE_KEY", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.core.session.model.UserProperties$a */
    /* loaded from: classes2.dex */
    public static final class C7232a {
        private C7232a() {
        }

        public /* synthetic */ C7232a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    public static /* synthetic */ UserProperties put$default(UserProperties userProperties, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        return userProperties.put(str, obj, z);
    }

    public static /* synthetic */ UserProperties putFax$default(UserProperties userProperties, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return userProperties.putFax(str, z);
    }

    public final UserProperties put(String str, Object obj, boolean z) {
        l.f(str, "key");
        l.f(obj, "value");
        super.putValue(str, obj, z);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UserProperties putAddress(Address address) {
        l.f(address, "address");
        Set<String> keySet = address.keySet();
        l.e(keySet, "address.keys");
        for (String str : keySet) {
            l.e(str, "key");
            Object obj = address.get(str);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            put(str, new C13287o(obj, Boolean.valueOf(address.getImmutable())));
        }
        return this;
    }

    public final UserProperties putAge(int i) {
        return put(AGE_KEY, Integer.valueOf(i), false);
    }

    public final UserProperties putBirthday(Date date) {
        l.f(date, BIRTHDAY_KEY);
        return put(BIRTHDAY_KEY, e.a.a.a.f.g.a.b(date), false);
    }

    public final UserProperties putCompany(String str) {
        l.f(str, COMPANY_KEY);
        return put(COMPANY_KEY, str, false);
    }

    public final UserProperties putDescription(String str) {
        l.f(str, DESCRIPTION_KEY);
        return put(DESCRIPTION_KEY, str, false);
    }

    public final UserProperties putEmail(String str) {
        l.f(str, "email");
        return put("email", str, false);
    }

    public final UserProperties putFax(String str) {
        l.f(str, FAX_KEY);
        return put(FAX_KEY, str, false);
    }

    public final UserProperties putGender(String str) {
        l.f(str, GENDER_KEY);
        return put(GENDER_KEY, str, false);
    }

    public final UserProperties putIndustry(String str) {
        l.f(str, INDUSTRY_KEY);
        return put(INDUSTRY_KEY, str, false);
    }

    public final UserProperties putName(String str) {
        l.f(str, NAME_KEY);
        return put(NAME_KEY, str, false);
    }

    public final UserProperties putPhone(String str) {
        l.f(str, "phone");
        return put("phone", str, false);
    }

    public final UserProperties putTitle(String str) {
        l.f(str, "title");
        return put("title", str, false);
    }

    public final UserProperties putUsername(String str) {
        l.f(str, "username");
        return put("username", str, false);
    }

    public final UserProperties putWebsite(String str) {
        l.f(str, WEBSITE_KEY);
        return put(WEBSITE_KEY, str, false);
    }

    public final UserProperties putAge(int i, boolean z) {
        return put(AGE_KEY, Integer.valueOf(i), z);
    }

    public final UserProperties putBirthday(Date date, boolean z) {
        l.f(date, BIRTHDAY_KEY);
        return put(BIRTHDAY_KEY, e.a.a.a.f.g.a.b(date), z);
    }

    public final UserProperties putCompany(String str, boolean z) {
        l.f(str, COMPANY_KEY);
        return put(COMPANY_KEY, str, z);
    }

    public final UserProperties putDescription(String str, boolean z) {
        l.f(str, DESCRIPTION_KEY);
        return put(DESCRIPTION_KEY, str, z);
    }

    public final UserProperties putEmail(String str, boolean z) {
        l.f(str, "email");
        return put("email", str, z);
    }

    public final UserProperties putFax(String str, boolean z) {
        l.f(str, FAX_KEY);
        return put(FAX_KEY, str, z);
    }

    public final UserProperties putGender(String str, boolean z) {
        l.f(str, GENDER_KEY);
        return put(GENDER_KEY, str, z);
    }

    public final UserProperties putIndustry(String str, boolean z) {
        l.f(str, INDUSTRY_KEY);
        return put(INDUSTRY_KEY, str, z);
    }

    public final UserProperties putName(String str, boolean z) {
        l.f(str, NAME_KEY);
        return put(NAME_KEY, str, z);
    }

    public final UserProperties putPhone(String str, boolean z) {
        l.f(str, "phone");
        return put("phone", str, z);
    }

    public final UserProperties putTitle(String str, boolean z) {
        l.f(str, "title");
        return put("title", str, z);
    }

    public final UserProperties putUsername(String str, boolean z) {
        l.f(str, "username");
        return put("username", str, z);
    }

    public final UserProperties putWebsite(String str, boolean z) {
        l.f(str, WEBSITE_KEY);
        return put(WEBSITE_KEY, str, z);
    }
}

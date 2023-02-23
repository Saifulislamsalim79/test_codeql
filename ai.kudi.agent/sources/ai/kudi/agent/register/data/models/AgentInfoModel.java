package ai.kudi.agent.register.data.models;

import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AgentInfoModel.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bV\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÑ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0002\u0010'J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0010HÆ\u0003J\t\u0010]\u001a\u00020\u0010HÆ\u0003J\t\u0010^\u001a\u00020\u0010HÆ\u0003J\t\u0010_\u001a\u00020\u0010HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020 HÆ\u0003J\t\u0010m\u001a\u00020 HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020&HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003JÕ\u0002\u0010y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&HÆ\u0001J\u0013\u0010z\u001a\u00020&2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010|\u001a\u00020}HÖ\u0001J\t\u0010~\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010)\"\u0004\b2\u00103R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010!\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010)\"\u0004\b?\u00103R\u0011\u0010@\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bH\u0010DR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010)R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010)R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010)R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010)R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010)\"\u0004\bP\u00103R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010SR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010)R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010)R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u00103¨\u0006\u007f"}, m10421d2 = {"Lai/kudi/agent/register/data/models/AgentInfoModel;", "", "id", "", "firstName", "lastName", "email", CacheDataSource.PREF_USERNAME, "gender", "phoneNumber", "homeAddress", PhoneFragment.ARG_BVN, SendReceiptToTerminalConfirmationBottomSheet.STATE, "city", "localGovernmentArea", "latitude", "", "longitude", "lgaLatitude", "lgaLongitude", "businessName", "businessAddress", "cacRegistrationNo", "managerId", "referrerPhone", "pin", "profilePictureId", "referralType", "registrationId", "deviceId", "deviceName", "expiresInMinutes", "", "expiresInSeconds", "estimatedTransactionRange", "utilityBillImageId", "identificationCardImageId", "skipOtp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBusinessAddress", "()Ljava/lang/String;", "getBusinessName", "getBvn", "getCacRegistrationNo", "getCity", "getDeviceId", "getDeviceName", "getEmail", "getEstimatedTransactionRange", "setEstimatedTransactionRange", "(Ljava/lang/String;)V", "getExpiresInMinutes", "()J", "setExpiresInMinutes", "(J)V", "getExpiresInSeconds", "setExpiresInSeconds", "getFirstName", "getGender", "getHomeAddress", "getId", "getIdentificationCardImageId", "setIdentificationCardImageId", "isComplete", "()Z", "getLastName", "getLatitude", "()F", "getLgaLatitude", "getLgaLongitude", "getLocalGovernmentArea", "getLongitude", "getManagerId", "getPhoneNumber", "getPin", "getProfilePictureId", "getReferralType", "getReferrerPhone", "getRegistrationId", "setRegistrationId", "getSkipOtp", "setSkipOtp", "(Z)V", "getState", "getUsername", "getUtilityBillImageId", "setUtilityBillImageId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AgentInfoModel {
    private final String businessAddress;
    private final String businessName;
    private final String cacRegistrationNo;
    private final String city;
    private final String deviceId;
    private final String deviceName;
    private final String email;
    private String estimatedTransactionRange;
    private long expiresInMinutes;
    private long expiresInSeconds;
    private final String first;
    private final String firstName;
    private final String gender;
    private final String homeAddress;

    /* renamed from: id */
    private final String f1006id;
    private String identificationCardImageId;
    private final String lastName;
    private final float latitude;
    private final float lgaLatitude;
    private final float lgaLongitude;
    private final String localGovernmentArea;
    private final float longitude;
    private final String managerId;
    private final String phoneNumber;
    private final String profilePictureId;
    private final String range;
    private final String referralType;
    private final String referrerPhone;
    private String registrationId;
    private boolean skipOtp;
    private final String state;
    private final String username;
    private String utilityBillImageId;

    public AgentInfoModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, false, -1, 1, null);
    }

    public AgentInfoModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, float f, float f2, float f3, float f4, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, long j, long j2, String str24, String str25, String str26, boolean z) {
        Log_OC.getArray(str2, "firstName");
        Log_OC.getArray(str3, "lastName");
        Log_OC.getArray(str4, "email");
        Log_OC.getArray(str5, CacheDataSource.PREF_USERNAME);
        Log_OC.getArray(str6, "gender");
        Log_OC.getArray(str7, "phoneNumber");
        Log_OC.getArray(str8, "homeAddress");
        Log_OC.getArray(str9, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str10, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.getArray(str11, "city");
        Log_OC.getArray(str12, "localGovernmentArea");
        Log_OC.getArray(str13, "businessName");
        Log_OC.getArray(str14, "businessAddress");
        Log_OC.getArray(str15, "cacRegistrationNo");
        Log_OC.getArray(str16, "managerId");
        Log_OC.getArray(str17, "referrerPhone");
        Log_OC.getArray(str18, "pin");
        Log_OC.getArray(str19, "profilePictureId");
        Log_OC.getArray(str20, "referralType");
        Log_OC.getArray(str21, "registrationId");
        Log_OC.getArray(str22, "deviceId");
        Log_OC.getArray(str23, "deviceName");
        Log_OC.getArray(str24, "estimatedTransactionRange");
        Log_OC.getArray(str25, "utilityBillImageId");
        Log_OC.getArray(str26, "identificationCardImageId");
        this.f1006id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.email = str4;
        this.username = str5;
        this.gender = str6;
        this.phoneNumber = str7;
        this.homeAddress = str8;
        this.first = str9;
        this.state = str10;
        this.city = str11;
        this.localGovernmentArea = str12;
        this.latitude = f;
        this.longitude = f2;
        this.lgaLatitude = f3;
        this.lgaLongitude = f4;
        this.businessName = str13;
        this.businessAddress = str14;
        this.cacRegistrationNo = str15;
        this.managerId = str16;
        this.referrerPhone = str17;
        this.range = str18;
        this.profilePictureId = str19;
        this.referralType = str20;
        this.registrationId = str21;
        this.deviceId = str22;
        this.deviceName = str23;
        this.expiresInMinutes = j;
        this.expiresInSeconds = j2;
        this.estimatedTransactionRange = str24;
        this.utilityBillImageId = str25;
        this.identificationCardImageId = str26;
        this.skipOtp = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AgentInfoModel(java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, float r53, float r54, float r55, float r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, long r68, long r70, java.lang.String r72, java.lang.String r73, java.lang.String r74, boolean r75, int r76, int r77, kotlin.p483e0.p485d.DBUtils$1 r78) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.data.models.AgentInfoModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, float, float, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AgentInfoModel copy$default(AgentInfoModel agentInfoModel, String $r2, String $r3, String $r4, String $r5, String $r6, String $r7, String $r8, String $r9, String $r10, String $r11, String $r12, String $r13, float $f0, float $f1, float $f2, float $f3, String $r14, String $r15, String $r16, String $r17, String $r18, String $r19, String $r20, String $r21, String $r22, String $r23, String $r24, long $l2, long $l3, String $r25, String $r26, String $r27, boolean $z0, int $i0, int i, Object obj) {
        int $i4 = $i0 & 1;
        if ($i4 != 0) {
            $r2 = agentInfoModel.f1006id;
        }
        int $i42 = $i0 & 2;
        if ($i42 != 0) {
            $r3 = agentInfoModel.firstName;
        }
        int $i43 = $i0 & 4;
        if ($i43 != 0) {
            $r4 = agentInfoModel.lastName;
        }
        int $i44 = $i0 & 8;
        if ($i44 != 0) {
            $r5 = agentInfoModel.email;
        }
        int $i45 = $i0 & 16;
        if ($i45 != 0) {
            $r6 = agentInfoModel.username;
        }
        int $i46 = $i0 & 32;
        if ($i46 != 0) {
            $r7 = agentInfoModel.gender;
        }
        int $i47 = $i0 & 64;
        if ($i47 != 0) {
            $r8 = agentInfoModel.phoneNumber;
        }
        int $i48 = $i0 & 128;
        if ($i48 != 0) {
            $r9 = agentInfoModel.homeAddress;
        }
        int $i49 = $i0 & 256;
        if ($i49 != 0) {
            $r10 = agentInfoModel.first;
        }
        int $i410 = $i0 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        if ($i410 != 0) {
            $r11 = agentInfoModel.state;
        }
        int $i411 = $i0 & 1024;
        if ($i411 != 0) {
            $r12 = agentInfoModel.city;
        }
        int $i412 = $i0 & IjkMediaMeta.FF_PROFILE_H264_INTRA;
        if ($i412 != 0) {
            String $r132 = agentInfoModel.localGovernmentArea;
            $r13 = $r132;
        }
        int $i413 = $i0 & 4096;
        if ($i413 != 0) {
            float $f02 = agentInfoModel.latitude;
            $f0 = $f02;
        }
        int $i414 = $i0 & 8192;
        if ($i414 != 0) {
            float $f12 = agentInfoModel.longitude;
            $f1 = $f12;
        }
        int $i415 = $i0 & 16384;
        if ($i415 != 0) {
            float $f22 = agentInfoModel.lgaLatitude;
            $f2 = $f22;
        }
        int $i416 = $i0 & 32768;
        if ($i416 != 0) {
            float $f32 = agentInfoModel.lgaLongitude;
            $f3 = $f32;
        }
        int $i417 = $i0 & 65536;
        if ($i417 != 0) {
            String $r142 = agentInfoModel.businessName;
            $r14 = $r142;
        }
        int $i418 = $i0 & 131072;
        if ($i418 != 0) {
            String $r152 = agentInfoModel.businessAddress;
            $r15 = $r152;
        }
        int $i419 = $i0 & 262144;
        if ($i419 != 0) {
            String $r162 = agentInfoModel.cacRegistrationNo;
            $r16 = $r162;
        }
        int $i420 = $i0 & 524288;
        if ($i420 != 0) {
            String $r172 = agentInfoModel.managerId;
            $r17 = $r172;
        }
        int $i421 = $i0 & 1048576;
        if ($i421 != 0) {
            String $r182 = agentInfoModel.referrerPhone;
            $r18 = $r182;
        }
        int $i422 = $i0 & 2097152;
        if ($i422 != 0) {
            String $r192 = agentInfoModel.range;
            $r19 = $r192;
        }
        int $i423 = $i0 & 4194304;
        if ($i423 != 0) {
            String $r202 = agentInfoModel.profilePictureId;
            $r20 = $r202;
        }
        int $i424 = $i0 & 8388608;
        if ($i424 != 0) {
            String $r212 = agentInfoModel.referralType;
            $r21 = $r212;
        }
        int $i425 = $i0 & 16777216;
        if ($i425 != 0) {
            String $r222 = agentInfoModel.registrationId;
            $r22 = $r222;
        }
        int $i426 = $i0 & 33554432;
        if ($i426 != 0) {
            String $r232 = agentInfoModel.deviceId;
            $r23 = $r232;
        }
        int $i427 = $i0 & 67108864;
        if ($i427 != 0) {
            String $r242 = agentInfoModel.deviceName;
            $r24 = $r242;
        }
        int $i428 = $i0 & 134217728;
        if ($i428 != 0) {
            long $l22 = agentInfoModel.expiresInMinutes;
            $l2 = $l22;
        }
        int $i429 = $i0 & 268435456;
        if ($i429 != 0) {
            long $l32 = agentInfoModel.expiresInSeconds;
            $l3 = $l32;
        }
        int $i430 = $i0 & 536870912;
        if ($i430 != 0) {
            String $r252 = agentInfoModel.estimatedTransactionRange;
            $r25 = $r252;
        }
        int $i431 = 1073741824 & $i0;
        if ($i431 != 0) {
            String $r262 = agentInfoModel.utilityBillImageId;
            $r26 = $r262;
        }
        if (($i0 & Integer.MIN_VALUE) != 0) {
            String $r272 = agentInfoModel.identificationCardImageId;
            $r27 = $r272;
        }
        if ((i & 1) != 0) {
            boolean $z02 = agentInfoModel.skipOtp;
            $z0 = $z02;
        }
        AgentInfoModel $r0 = agentInfoModel.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r13, $f0, $f1, $f2, $f3, $r14, $r15, $r16, $r17, $r18, $r19, $r20, $r21, $r22, $r23, $r24, $l2, $l3, $r25, $r26, $r27, $z0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.f1006id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component11() {
        String r1 = this.city;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component12() {
        String r1 = this.localGovernmentArea;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float component13() {
        float f0 = this.latitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float component14() {
        float f0 = this.longitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float component15() {
        float f0 = this.lgaLatitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float component16() {
        float f0 = this.lgaLongitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component17() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component18() {
        String r1 = this.businessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component19() {
        String r1 = this.cacRegistrationNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component20() {
        String r1 = this.managerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component21() {
        String r1 = this.referrerPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component22() {
        String r1 = this.range;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component23() {
        String r1 = this.profilePictureId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component24() {
        String r1 = this.referralType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component25() {
        String r1 = this.registrationId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component26() {
        String r1 = this.deviceId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component27() {
        String r1 = this.deviceName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long component28() {
        long l0 = this.expiresInMinutes;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long component29() {
        long l0 = this.expiresInSeconds;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.lastName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component30() {
        String r1 = this.estimatedTransactionRange;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component31() {
        String r1 = this.utilityBillImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component32() {
        String r1 = this.identificationCardImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component33() {
        boolean z0 = this.skipOtp;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.gender;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.first;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AgentInfoModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, float f, float f2, float f3, float f4, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, long j, long j2, String str24, String str25, String str26, boolean z) {
        Log_OC.getArray(str2, "firstName");
        Log_OC.getArray(str3, "lastName");
        Log_OC.getArray(str4, "email");
        Log_OC.getArray(str5, CacheDataSource.PREF_USERNAME);
        Log_OC.getArray(str6, "gender");
        Log_OC.getArray(str7, "phoneNumber");
        Log_OC.getArray(str8, "homeAddress");
        Log_OC.getArray(str9, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str10, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.getArray(str11, "city");
        Log_OC.getArray(str12, "localGovernmentArea");
        Log_OC.getArray(str13, "businessName");
        Log_OC.getArray(str14, "businessAddress");
        Log_OC.getArray(str15, "cacRegistrationNo");
        Log_OC.getArray(str16, "managerId");
        Log_OC.getArray(str17, "referrerPhone");
        Log_OC.getArray(str18, "pin");
        Log_OC.getArray(str19, "profilePictureId");
        Log_OC.getArray(str20, "referralType");
        Log_OC.getArray(str21, "registrationId");
        Log_OC.getArray(str22, "deviceId");
        Log_OC.getArray(str23, "deviceName");
        Log_OC.getArray(str24, "estimatedTransactionRange");
        Log_OC.getArray(str25, "utilityBillImageId");
        Log_OC.getArray(str26, "identificationCardImageId");
        AgentInfoModel $r0 = new AgentInfoModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, f, f2, f3, f4, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, j, j2, str24, str25, str26, z);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof AgentInfoModel;
        if ($z0) {
            AgentInfoModel $r2 = (AgentInfoModel) obj;
            String $r3 = this.f1006id;
            String $r4 = $r2.f1006id;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.firstName;
                String $r42 = $r2.firstName;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.lastName;
                    String $r43 = $r2.lastName;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        String $r34 = this.email;
                        String $r44 = $r2.email;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            String $r35 = this.username;
                            String $r45 = $r2.username;
                            boolean $z06 = Log_OC.append($r35, $r45);
                            if ($z06) {
                                String $r36 = this.gender;
                                String $r46 = $r2.gender;
                                boolean $z07 = Log_OC.append($r36, $r46);
                                if ($z07) {
                                    String $r37 = this.phoneNumber;
                                    String $r47 = $r2.phoneNumber;
                                    boolean $z08 = Log_OC.append($r37, $r47);
                                    if ($z08) {
                                        String $r38 = this.homeAddress;
                                        String $r48 = $r2.homeAddress;
                                        boolean $z09 = Log_OC.append($r38, $r48);
                                        if ($z09) {
                                            String $r39 = this.first;
                                            String $r49 = $r2.first;
                                            boolean $z010 = Log_OC.append($r39, $r49);
                                            if ($z010) {
                                                String $r310 = this.state;
                                                String $r410 = $r2.state;
                                                boolean $z011 = Log_OC.append($r310, $r410);
                                                if ($z011) {
                                                    String $r311 = this.city;
                                                    String $r411 = $r2.city;
                                                    boolean $z012 = Log_OC.append($r311, $r411);
                                                    if ($z012) {
                                                        String $r312 = this.localGovernmentArea;
                                                        String $r412 = $r2.localGovernmentArea;
                                                        boolean $z013 = Log_OC.append($r312, $r412);
                                                        if ($z013) {
                                                            float $f0 = this.latitude;
                                                            Float $r5 = Float.valueOf($f0);
                                                            float $f02 = $r2.latitude;
                                                            Float $r6 = Float.valueOf($f02);
                                                            boolean $z014 = Log_OC.append($r5, $r6);
                                                            if ($z014) {
                                                                float $f03 = this.longitude;
                                                                Float $r52 = Float.valueOf($f03);
                                                                float $f04 = $r2.longitude;
                                                                Float $r62 = Float.valueOf($f04);
                                                                boolean $z015 = Log_OC.append($r52, $r62);
                                                                if ($z015) {
                                                                    float $f05 = this.lgaLatitude;
                                                                    Float $r53 = Float.valueOf($f05);
                                                                    float $f06 = $r2.lgaLatitude;
                                                                    Float $r63 = Float.valueOf($f06);
                                                                    boolean $z016 = Log_OC.append($r53, $r63);
                                                                    if ($z016) {
                                                                        float $f07 = this.lgaLongitude;
                                                                        Float $r54 = Float.valueOf($f07);
                                                                        float $f08 = $r2.lgaLongitude;
                                                                        Float $r64 = Float.valueOf($f08);
                                                                        boolean $z017 = Log_OC.append($r54, $r64);
                                                                        if ($z017) {
                                                                            String $r313 = this.businessName;
                                                                            String $r413 = $r2.businessName;
                                                                            boolean $z018 = Log_OC.append($r313, $r413);
                                                                            if ($z018) {
                                                                                String $r314 = this.businessAddress;
                                                                                String $r414 = $r2.businessAddress;
                                                                                boolean $z019 = Log_OC.append($r314, $r414);
                                                                                if ($z019) {
                                                                                    String $r315 = this.cacRegistrationNo;
                                                                                    String $r415 = $r2.cacRegistrationNo;
                                                                                    boolean $z020 = Log_OC.append($r315, $r415);
                                                                                    if ($z020) {
                                                                                        String $r316 = this.managerId;
                                                                                        String $r416 = $r2.managerId;
                                                                                        boolean $z021 = Log_OC.append($r316, $r416);
                                                                                        if ($z021) {
                                                                                            String $r317 = this.referrerPhone;
                                                                                            String $r417 = $r2.referrerPhone;
                                                                                            boolean $z022 = Log_OC.append($r317, $r417);
                                                                                            if ($z022) {
                                                                                                String $r318 = this.range;
                                                                                                String $r418 = $r2.range;
                                                                                                boolean $z023 = Log_OC.append($r318, $r418);
                                                                                                if ($z023) {
                                                                                                    String $r319 = this.profilePictureId;
                                                                                                    String $r419 = $r2.profilePictureId;
                                                                                                    boolean $z024 = Log_OC.append($r319, $r419);
                                                                                                    if ($z024) {
                                                                                                        String $r320 = this.referralType;
                                                                                                        String $r420 = $r2.referralType;
                                                                                                        boolean $z025 = Log_OC.append($r320, $r420);
                                                                                                        if ($z025) {
                                                                                                            String $r321 = this.registrationId;
                                                                                                            String $r421 = $r2.registrationId;
                                                                                                            boolean $z026 = Log_OC.append($r321, $r421);
                                                                                                            if ($z026) {
                                                                                                                String $r322 = this.deviceId;
                                                                                                                String $r422 = $r2.deviceId;
                                                                                                                boolean $z027 = Log_OC.append($r322, $r422);
                                                                                                                if ($z027) {
                                                                                                                    String $r323 = this.deviceName;
                                                                                                                    String $r423 = $r2.deviceName;
                                                                                                                    boolean $z028 = Log_OC.append($r323, $r423);
                                                                                                                    if ($z028) {
                                                                                                                        long $l0 = this.expiresInMinutes;
                                                                                                                        long $l1 = $r2.expiresInMinutes;
                                                                                                                        if ($l0 != $l1) {
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        long $l02 = this.expiresInSeconds;
                                                                                                                        long $l12 = $r2.expiresInSeconds;
                                                                                                                        if ($l02 != $l12) {
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        String $r324 = this.estimatedTransactionRange;
                                                                                                                        String $r424 = $r2.estimatedTransactionRange;
                                                                                                                        boolean $z029 = Log_OC.append($r324, $r424);
                                                                                                                        if ($z029) {
                                                                                                                            String $r325 = this.utilityBillImageId;
                                                                                                                            String $r425 = $r2.utilityBillImageId;
                                                                                                                            boolean $z030 = Log_OC.append($r325, $r425);
                                                                                                                            if ($z030) {
                                                                                                                                String $r326 = this.identificationCardImageId;
                                                                                                                                String $r426 = $r2.identificationCardImageId;
                                                                                                                                boolean $z031 = Log_OC.append($r326, $r426);
                                                                                                                                if ($z031) {
                                                                                                                                    boolean $z032 = this.skipOtp;
                                                                                                                                    boolean $z1 = $r2.skipOtp;
                                                                                                                                    return $z032 == $z1;
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                                return false;
                                                                                                            }
                                                                                                            return false;
                                                                                                        }
                                                                                                        return false;
                                                                                                    }
                                                                                                    return false;
                                                                                                }
                                                                                                return false;
                                                                                            }
                                                                                            return false;
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    return false;
                                                                                }
                                                                                return false;
                                                                            }
                                                                            return false;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBusinessAddress() {
        String r1 = this.businessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBusinessName() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBvn() {
        String r1 = this.first;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCacRegistrationNo() {
        String r1 = this.cacRegistrationNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCity() {
        String r1 = this.city;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDeviceId() {
        String r1 = this.deviceId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDeviceName() {
        String r1 = this.deviceName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEmail() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEstimatedTransactionRange() {
        String r1 = this.estimatedTransactionRange;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getExpiresInMinutes() {
        long l0 = this.expiresInMinutes;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getExpiresInSeconds() {
        long l0 = this.expiresInSeconds;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getFirstName() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getGender() {
        String r1 = this.gender;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getHomeAddress() {
        String r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getId() {
        String r1 = this.f1006id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getIdentificationCardImageId() {
        String r1 = this.identificationCardImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLastName() {
        String r1 = this.lastName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getLatitude() {
        float f0 = this.latitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getLgaLatitude() {
        float f0 = this.lgaLatitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getLgaLongitude() {
        float f0 = this.lgaLongitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLocalGovernmentArea() {
        String r1 = this.localGovernmentArea;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getLongitude() {
        float f0 = this.longitude;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getManagerId() {
        String r1 = this.managerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPin() {
        String r1 = this.range;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProfilePictureId() {
        String r1 = this.profilePictureId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReferralType() {
        String r1 = this.referralType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReferrerPhone() {
        String r1 = this.referrerPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getRegistrationId() {
        String r1 = this.registrationId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getSkipOtp() {
        boolean z0 = this.skipOtp;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getState() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUsername() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUtilityBillImageId() {
        String r1 = this.utilityBillImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.f1006id;
        int $i0 = $r1 == null ? 0 : $r1.hashCode();
        int $i1 = this.firstName.hashCode();
        int $i12 = this.lastName.hashCode();
        int $i13 = this.email.hashCode();
        int $i14 = this.username.hashCode();
        int $i15 = this.gender.hashCode();
        int $i16 = this.phoneNumber.hashCode();
        int $i17 = this.homeAddress.hashCode();
        int $i18 = this.first.hashCode();
        int $i19 = this.state.hashCode();
        int $i110 = this.city.hashCode();
        int $i111 = this.localGovernmentArea.hashCode();
        float $f0 = this.latitude;
        int $i112 = Float.floatToIntBits($f0);
        float $f02 = this.longitude;
        int $i113 = Float.floatToIntBits($f02);
        float $f03 = this.lgaLatitude;
        int $i114 = Float.floatToIntBits($f03);
        float $f04 = this.lgaLongitude;
        int $i115 = Float.floatToIntBits($f04);
        int $i116 = this.businessName.hashCode();
        int $i117 = this.businessAddress.hashCode();
        int $i118 = this.cacRegistrationNo.hashCode();
        int $i119 = this.managerId.hashCode();
        int $i120 = this.referrerPhone.hashCode();
        int $i121 = this.range.hashCode();
        int $i122 = this.profilePictureId.hashCode();
        int $i123 = this.referralType.hashCode();
        int $i124 = this.registrationId.hashCode();
        int $i125 = this.deviceId.hashCode();
        int $i126 = this.deviceName.hashCode();
        long $l2 = this.expiresInMinutes;
        int $i127 = Version$BuildAwareOrder.compare($l2);
        long $l22 = this.expiresInSeconds;
        int $i128 = Version$BuildAwareOrder.compare($l22);
        int $i129 = this.estimatedTransactionRange.hashCode();
        int $i130 = this.utilityBillImageId.hashCode();
        int $i131 = this.identificationCardImageId.hashCode();
        int $i02 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31) + $i16) * 31) + $i17) * 31) + $i18) * 31) + $i19) * 31) + $i110) * 31) + $i111) * 31) + $i112) * 31) + $i113) * 31) + $i114) * 31) + $i115) * 31) + $i116) * 31) + $i117) * 31) + $i118) * 31) + $i119) * 31) + $i120) * 31) + $i121) * 31) + $i122) * 31) + $i123) * 31) + $i124) * 31) + $i125) * 31) + $i126) * 31) + $i127) * 31) + $i128) * 31) + $i129) * 31) + $i130) * 31) + $i131) * 31;
        boolean $z0 = this.skipOtp;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i132 = i;
        return $i02 + $i132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isComplete() {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        boolean $z06;
        boolean $z07;
        boolean $z08;
        boolean $z09;
        boolean $z010;
        String $r1 = this.firstName;
        $z0 = C13276s.m5440u($r1);
        if (!$z0) {
            String $r12 = this.lastName;
            $z02 = C13276s.m5440u($r12);
            if (!$z02) {
                String $r13 = this.username;
                $z03 = C13276s.m5440u($r13);
                if (!$z03) {
                    String $r14 = this.gender;
                    $z04 = C13276s.m5440u($r14);
                    if (!$z04) {
                        String $r15 = this.phoneNumber;
                        $z05 = C13276s.m5440u($r15);
                        if (!$z05) {
                            String $r16 = this.homeAddress;
                            $z06 = C13276s.m5440u($r16);
                            if (!$z06) {
                                String $r17 = this.businessName;
                                $z07 = C13276s.m5440u($r17);
                                if (!$z07) {
                                    String $r18 = this.businessAddress;
                                    $z08 = C13276s.m5440u($r18);
                                    if (!$z08) {
                                        String $r19 = this.range;
                                        $z09 = C13276s.m5440u($r19);
                                        if (!$z09) {
                                            String $r110 = this.profilePictureId;
                                            $z010 = C13276s.m5440u($r110);
                                            return $z010 ^ true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void setEstimatedTransactionRange(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.estimatedTransactionRange = str;
    }

    public final void setExpiresInMinutes(long j) {
        this.expiresInMinutes = j;
    }

    public final void setExpiresInSeconds(long j) {
        this.expiresInSeconds = j;
    }

    public final void setIdentificationCardImageId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.identificationCardImageId = str;
    }

    public final void setRegistrationId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.registrationId = str;
    }

    public final void setSkipOtp(boolean z) {
        this.skipOtp = z;
    }

    public final void setUtilityBillImageId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.utilityBillImageId = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("AgentInfoModel(id=");
        String $r1 = this.f1006id;
        $r2.append((Object) $r1);
        $r2.append(", firstName=");
        String $r12 = this.firstName;
        $r2.append($r12);
        $r2.append(", lastName=");
        String $r13 = this.lastName;
        $r2.append($r13);
        $r2.append(", email=");
        String $r14 = this.email;
        $r2.append($r14);
        $r2.append(", username=");
        String $r15 = this.username;
        $r2.append($r15);
        $r2.append(", gender=");
        String $r16 = this.gender;
        $r2.append($r16);
        $r2.append(", phoneNumber=");
        String $r17 = this.phoneNumber;
        $r2.append($r17);
        $r2.append(", homeAddress=");
        String $r18 = this.homeAddress;
        $r2.append($r18);
        $r2.append(", bvn=");
        String $r19 = this.first;
        $r2.append($r19);
        $r2.append(", state=");
        String $r110 = this.state;
        $r2.append($r110);
        $r2.append(", city=");
        String $r111 = this.city;
        $r2.append($r111);
        $r2.append(", localGovernmentArea=");
        String $r112 = this.localGovernmentArea;
        $r2.append($r112);
        $r2.append(", latitude=");
        float $f0 = this.latitude;
        $r2.append($f0);
        $r2.append(", longitude=");
        float $f02 = this.longitude;
        $r2.append($f02);
        $r2.append(", lgaLatitude=");
        float $f03 = this.lgaLatitude;
        $r2.append($f03);
        $r2.append(", lgaLongitude=");
        float $f04 = this.lgaLongitude;
        $r2.append($f04);
        $r2.append(", businessName=");
        String $r113 = this.businessName;
        $r2.append($r113);
        $r2.append(", businessAddress=");
        String $r114 = this.businessAddress;
        $r2.append($r114);
        $r2.append(", cacRegistrationNo=");
        String $r115 = this.cacRegistrationNo;
        $r2.append($r115);
        $r2.append(", managerId=");
        String $r116 = this.managerId;
        $r2.append($r116);
        $r2.append(", referrerPhone=");
        String $r117 = this.referrerPhone;
        $r2.append($r117);
        $r2.append(", pin=");
        String $r118 = this.range;
        $r2.append($r118);
        $r2.append(", profilePictureId=");
        String $r119 = this.profilePictureId;
        $r2.append($r119);
        $r2.append(", referralType=");
        String $r120 = this.referralType;
        $r2.append($r120);
        $r2.append(", registrationId=");
        String $r121 = this.registrationId;
        $r2.append($r121);
        $r2.append(", deviceId=");
        String $r122 = this.deviceId;
        $r2.append($r122);
        $r2.append(", deviceName=");
        String $r123 = this.deviceName;
        $r2.append($r123);
        $r2.append(", expiresInMinutes=");
        long $l0 = this.expiresInMinutes;
        $r2.append($l0);
        $r2.append(", expiresInSeconds=");
        long $l02 = this.expiresInSeconds;
        $r2.append($l02);
        $r2.append(", estimatedTransactionRange=");
        String $r124 = this.estimatedTransactionRange;
        $r2.append($r124);
        $r2.append(", utilityBillImageId=");
        String $r125 = this.utilityBillImageId;
        $r2.append($r125);
        $r2.append(", identificationCardImageId=");
        String $r126 = this.identificationCardImageId;
        $r2.append($r126);
        $r2.append(", skipOtp=");
        boolean $z0 = this.skipOtp;
        $r2.append($z0);
        $r2.append(')');
        String $r127 = $r2.toString();
        return $r127;
    }
}

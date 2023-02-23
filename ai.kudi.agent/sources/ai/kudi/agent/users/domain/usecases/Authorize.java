package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.login.domain.wiki.LoginRequest;
import ai.kudi.agent.login.domain.wiki.LoginResponse;
import ai.kudi.agent.users.data.network.UserService;
import android.os.Build;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: Authorize.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/Authorize;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/usecases/AuthorizeOps;", "Lai/kudi/agent/users/domain/usecases/Authorize$Input;", "networkService", "Lai/kudi/agent/users/data/network/UserService;", "(Lai/kudi/agent/users/data/network/UserService;)V", "getNetworkService", "()Lai/kudi/agent/users/data/network/UserService;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "Input", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Authorize implements OneInputUseCase<AuthorizeOps, Input> {
    private final UserService networkService;

    /* compiled from: Authorize.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/Authorize$Input;", "", "phoneNumber", "", "pin", "deviceId", "deviceName", "imeI", "isAuthInLoggedInSession", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDeviceId", "()Ljava/lang/String;", "getDeviceName", "getImeI", "()Z", "getPhoneNumber", "getPin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Input {
        private final String deviceId;
        private final String deviceName;
        private final String imeI;
        private final boolean isAuthInLoggedInSession;
        private final String phoneNumber;
        private final String range;

        public Input(String str, String str2, String str3, String str4, String str5, boolean z) {
            Log_OC.getArray(str, "phoneNumber");
            Log_OC.getArray(str2, "pin");
            Log_OC.getArray(str3, "deviceId");
            Log_OC.getArray(str4, "deviceName");
            this.phoneNumber = str;
            this.range = str2;
            this.deviceId = str3;
            this.deviceName = str4;
            this.imeI = str5;
            this.isAuthInLoggedInSession = z;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Input(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, int r7, kotlin.p483e0.p485d.DBUtils$1 r8) {
            /*
                r0 = this;
                r7 = r7 & 32
                if (r7 == 0) goto L6
                r6 = 0
                goto L6
            L6:
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.domain.usecases.Authorize.Input.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Input copy$default(Input input, String $r4, String $r5, String $r0, String $r1, String $r2, boolean $z0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r4 = input.phoneNumber;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r5 = input.range;
            }
            int $i13 = i & 4;
            if ($i13 != 0) {
                $r0 = input.deviceId;
            }
            int $i14 = i & 8;
            if ($i14 != 0) {
                $r1 = input.deviceName;
            }
            int $i15 = i & 16;
            if ($i15 != 0) {
                $r2 = input.imeI;
            }
            int $i0 = i & 32;
            if ($i0 != 0) {
                $z0 = input.isAuthInLoggedInSession;
            }
            Input $r3 = input.copy($r4, $r5, $r0, $r1, $r2, $z0);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.phoneNumber;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.range;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.deviceId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component4() {
            String r1 = this.deviceName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component5() {
            String r1 = this.imeI;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component6() {
            boolean z0 = this.isAuthInLoggedInSession;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Input copy(String str, String str2, String str3, String str4, String str5, boolean z) {
            Log_OC.getArray(str, "phoneNumber");
            Log_OC.getArray(str2, "pin");
            Log_OC.getArray(str3, "deviceId");
            Log_OC.getArray(str4, "deviceName");
            Input $r0 = new Input(str, str2, str3, str4, str5, z);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Input;
            if ($z0) {
                Input $r2 = (Input) obj;
                String $r3 = this.phoneNumber;
                String $r4 = $r2.phoneNumber;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.range;
                    String $r42 = $r2.range;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.deviceId;
                        String $r43 = $r2.deviceId;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        if ($z04) {
                            String $r34 = this.deviceName;
                            String $r44 = $r2.deviceName;
                            boolean $z05 = Log_OC.append($r34, $r44);
                            if ($z05) {
                                String $r35 = this.imeI;
                                String $r45 = $r2.imeI;
                                boolean $z06 = Log_OC.append($r35, $r45);
                                if ($z06) {
                                    boolean $z07 = this.isAuthInLoggedInSession;
                                    boolean $z1 = $r2.isAuthInLoggedInSession;
                                    return $z07 == $z1;
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
        public final String getImeI() {
            String r1 = this.imeI;
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
        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String $r1 = this.phoneNumber;
            int $i0 = $r1.hashCode();
            String $r12 = this.range;
            int $i1 = $r12.hashCode();
            String $r13 = this.deviceId;
            int $i12 = $r13.hashCode();
            String $r14 = this.deviceName;
            int $i13 = $r14.hashCode();
            int $i02 = (((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31;
            String $r15 = this.imeI;
            int $i14 = $r15 == null ? 0 : $r15.hashCode();
            int $i03 = ($i02 + $i14) * 31;
            boolean $z0 = this.isAuthInLoggedInSession;
            int i = $z0;
            if ($z0 != 0) {
                i = 1;
            }
            int $i15 = i;
            return $i03 + $i15;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean isAuthInLoggedInSession() {
            boolean z0 = this.isAuthInLoggedInSession;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Input(phoneNumber=");
            String $r1 = this.phoneNumber;
            $r2.append($r1);
            $r2.append(", pin=");
            String $r12 = this.range;
            $r2.append($r12);
            $r2.append(", deviceId=");
            String $r13 = this.deviceId;
            $r2.append($r13);
            $r2.append(", deviceName=");
            String $r14 = this.deviceName;
            $r2.append($r14);
            $r2.append(", imeI=");
            String $r15 = this.imeI;
            $r2.append((Object) $r15);
            $r2.append(", isAuthInLoggedInSession=");
            boolean $z0 = this.isAuthInLoggedInSession;
            $r2.append($z0);
            $r2.append(')');
            String $r16 = $r2.toString();
            return $r16;
        }
    }

    public Authorize(UserService userService) {
        Log_OC.getArray(userService, "networkService");
        this.networkService = userService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final AuthorizeOps m41423execute$lambda0(LoginResponse loginResponse) {
        Log_OC.getArray(loginResponse, "it");
        AuthorizeOps $r1 = new AuthorizeOps(true, null, 2, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final AuthorizeOps m41424execute$lambda1(Throwable th) {
        Log_OC.getArray(th, "err");
        th.printStackTrace();
        AuthorizeOps $r1 = new AuthorizeOps(false, th);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(Input input) {
        Log_OC.getArray(input, MetricTracker.Object.INPUT);
        UserService $r2 = this.networkService;
        String $r5 = input.getPhoneNumber();
        String $r6 = input.getPin();
        String $r7 = input.getDeviceName();
        String $r8 = input.getDeviceId();
        String $r9 = input.getImeI();
        String $r3 = Build.VERSION.RELEASE;
        Log_OC.loadImage($r3, "RELEASE");
        boolean $z0 = input.isAuthInLoggedInSession();
        LoginRequest $r4 = new LoginRequest($r5, $r6, $r7, $r8, $r9, $r3, null, $z0, null, null, 832, null);
        AbstractC11688p $r10 = $r2.secureLogin($r4);
        Type $r11 = Type.f1866b;
        AbstractC11688p $r102 = $r10.m10531O($r11);
        C0670b $r12 = C0670b.f1869c;
        AbstractC11688p $r103 = $r102.m10526T($r12);
        p425j.p444e.Item $r13 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r104 = $r103.h0($r13);
        p425j.p444e.Item $r132 = ContextUtils.LogError();
        AbstractC11688p $r105 = $r104.R($r132);
        Log_OC.loadImage($r105, "networkService.secureLogin(\n                LoginRequest(\n                    input.phoneNumber,\n                    input.pin,\n                    input.deviceName,\n                    input.deviceId,\n                    input.imeI,\n                    Build.VERSION.RELEASE,\n                    isAuthInLoggedInSession = input.isAuthInLoggedInSession\n                )\n        )\n                .map {\n                    AuthorizeOps(true)\n                }\n                .onErrorReturn { err ->\n                    // most likely authorization failed.\n                    err.printStackTrace()\n                    AuthorizeOps(false, err)\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r105;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        Input $r3 = (Input) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserService getNetworkService() {
        UserService r1 = this.networkService;
        return r1;
    }
}

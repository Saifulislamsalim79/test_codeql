package ai.kudi.agent.login.setup.domain;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
import retrofit2.C14840l;
/* compiled from: AddDevice.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/login/setup/domain/AddDevice;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/login/setup/domain/AddDevice$Input;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/network/NetworkService;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "Input", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class AddDevice implements OneInputUseCase<Boolean, Input> {
    private final NetworkService networkService;

    /* compiled from: AddDevice.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/login/setup/domain/AddDevice$Input;", "", "deviceName", "", "deviceId", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getDeviceName", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Input {
        private final String deviceId;
        private final String deviceName;
        private final String sessionId;

        public Input(String str, String str2, String str3) {
            Log_OC.getArray(str, "deviceName");
            Log_OC.getArray(str2, "deviceId");
            Log_OC.getArray(str3, "sessionId");
            this.deviceName = str;
            this.deviceId = str2;
            this.sessionId = str3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Input copy$default(Input input, String $r1, String $r2, String $r3, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = input.deviceName;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = input.deviceId;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = input.sessionId;
            }
            Input $r0 = input.copy($r1, $r2, $r3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.deviceName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.deviceId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.sessionId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Input copy(String str, String str2, String str3) {
            Log_OC.getArray(str, "deviceName");
            Log_OC.getArray(str2, "deviceId");
            Log_OC.getArray(str3, "sessionId");
            Input $r0 = new Input(str, str2, str3);
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
                String $r3 = this.deviceName;
                String $r4 = $r2.deviceName;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.deviceId;
                    String $r42 = $r2.deviceId;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.sessionId;
                        String $r43 = $r2.sessionId;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        return $z04;
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
        public final String getSessionId() {
            String r1 = this.sessionId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.deviceName;
            int $i0 = $r1.hashCode();
            String $r12 = this.deviceId;
            int $i1 = $r12.hashCode();
            String $r13 = this.sessionId;
            int $i12 = $r13.hashCode();
            return ((($i0 * 31) + $i1) * 31) + $i12;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Input(deviceName=");
            String $r1 = this.deviceName;
            $r2.append($r1);
            $r2.append(", deviceId=");
            String $r12 = this.deviceId;
            $r2.append($r12);
            $r2.append(", sessionId=");
            String $r13 = this.sessionId;
            $r2.append($r13);
            $r2.append(')');
            String $r14 = $r2.toString();
            return $r14;
        }
    }

    public AddDevice(NetworkService networkService) {
        Log_OC.getArray(networkService, "networkService");
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Boolean m39736execute$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "response");
        Object $r1 = c14840l.m284a();
        Log_OC.append($r1);
        APIResponse $r2 = (APIResponse) $r1;
        boolean $z0 = $r2.status;
        Boolean $r3 = Boolean.valueOf($z0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(Input input) {
        Log_OC.getArray(input, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        String $r4 = input.getSessionId();
        AbstractC11688p $r5 = $r3.updateDeviceInfo($r4, input);
        Type $r6 = Type.GRIDSET;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.api.updateDeviceInfo(input.sessionId, input)\n                .map { response ->\n                    response.body()!!.status\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r54;
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
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}

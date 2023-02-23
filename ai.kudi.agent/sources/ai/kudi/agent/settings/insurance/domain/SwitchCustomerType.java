package ai.kudi.agent.settings.insurance.domain;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.settings.domain.dto.UserProfileResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13725q0;
import p425j.p444e.AbstractC11688p;
/* compiled from: SwitchCustomerType.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/domain/SwitchCustomerType;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "Lai/kudi/agent/settings/insurance/domain/SwitchCustomerType$SwitchCustomerTypeInput;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "SwitchCustomerTypeInput", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchCustomerType implements OneInputUseCase<UserProfileResponse, SwitchCustomerTypeInput> {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    /* compiled from: SwitchCustomerType.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/domain/SwitchCustomerType$SwitchCustomerTypeInput;", "", "sessionId", "", "target", "(Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getTarget", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SwitchCustomerTypeInput {
        private final String sessionId;
        private final String target;

        public SwitchCustomerTypeInput(String str, String str2) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(str2, "target");
            this.sessionId = str;
            this.target = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ SwitchCustomerTypeInput copy$default(SwitchCustomerTypeInput switchCustomerTypeInput, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = switchCustomerTypeInput.sessionId;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = switchCustomerTypeInput.target;
            }
            SwitchCustomerTypeInput $r0 = switchCustomerTypeInput.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.sessionId;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.target;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SwitchCustomerTypeInput copy(String str, String str2) {
            Log_OC.getArray(str, "sessionId");
            Log_OC.getArray(str2, "target");
            SwitchCustomerTypeInput $r0 = new SwitchCustomerTypeInput(str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof SwitchCustomerTypeInput;
            if ($z0) {
                SwitchCustomerTypeInput $r3 = (SwitchCustomerTypeInput) obj;
                String $r4 = this.sessionId;
                String $r1 = $r3.sessionId;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.target;
                    String $r42 = $r3.target;
                    boolean $z03 = Log_OC.append($r12, $r42);
                    return $z03;
                }
                return false;
            }
            return false;
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
        public final String getTarget() {
            String r1 = this.target;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.sessionId;
            int $i0 = $r1.hashCode();
            String $r12 = this.target;
            int $i1 = $r12.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("SwitchCustomerTypeInput(sessionId=");
            String $r1 = this.sessionId;
            $r2.append($r1);
            $r2.append(", target=");
            String $r12 = this.target;
            $r2.append($r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    public SwitchCustomerType(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final ai.kudi.agent.settings.domain.package_4.UserProfileResponse m40776execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        ai.kudi.agent.settings.domain.package_4.UserProfileResponse $r2 = (ai.kudi.agent.settings.domain.package_4.UserProfileResponse) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(SwitchCustomerTypeInput switchCustomerTypeInput) {
        Map $r7;
        Log_OC.getArray(switchCustomerTypeInput, MetricTracker.Object.INPUT);
        NetworkService $r2 = this.networkService;
        OnboardingApi $r3 = $r2.getOnboardingApi();
        String $r4 = switchCustomerTypeInput.getSessionId();
        String $r5 = switchCustomerTypeInput.getTarget();
        C13287o $r6 = C13664u.m4227a("targetCustomerType", $r5);
        $r7 = C13725q0.m3897g($r6);
        AbstractC11688p $r8 = $r3.switchCustomerType($r4, $r7);
        Type $r9 = Type.RSTRING;
        AbstractC11688p $r82 = $r8.m10531O($r9);
        RxSchedulers $r10 = this.rxSchedulers;
        p425j.p444e.Item $r11 = $r10.setSettings();
        AbstractC11688p $r83 = $r82.h0($r11);
        RxSchedulers $r102 = this.rxSchedulers;
        p425j.p444e.Item $r112 = $r102.main();
        AbstractC11688p $r84 = $r83.R($r112);
        Log_OC.loadImage($r84, "networkService.onboardingApi.switchCustomerType(input.sessionId, mapOf(\"targetCustomerType\" to input.target)).map {\n            it.data\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r84;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        SwitchCustomerTypeInput $r3 = (SwitchCustomerTypeInput) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}

package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.domain.room_entities.InsuranceStatusModel;
import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Language implements InterfaceC11291f {
    public static final /* synthetic */ Language JAPANESE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Language $r0 = new Language();
        JAPANESE = $r0;
    }

    private /* synthetic */ Language() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        InsuranceStatusModel $r1 = InsuranceRequests.m40756signUpForInsurance$lambda1($r3);
        return $r1;
    }
}

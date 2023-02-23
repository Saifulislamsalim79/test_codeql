package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.data.RegistrationRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SavePersonalInfo_Factory implements InterfaceC9468d<SavePersonalInfo> {
    private final InterfaceC11700a<RegistrationRepository> registrationRepoProvider;

    public SavePersonalInfo_Factory(InterfaceC11700a interfaceC11700a) {
        this.registrationRepoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavePersonalInfo_Factory create(InterfaceC11700a interfaceC11700a) {
        SavePersonalInfo_Factory $r1 = new SavePersonalInfo_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SavePersonalInfo newInstance(RegistrationRepository registrationRepository) {
        SavePersonalInfo $r1 = new SavePersonalInfo(registrationRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SavePersonalInfo multiply() {
        InterfaceC11700a $r1 = this.registrationRepoProvider;
        Object $r2 = $r1.get();
        RegistrationRepository $r3 = (RegistrationRepository) $r2;
        SavePersonalInfo $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40352multiply() {
        SavePersonalInfo $r1 = multiply();
        return $r1;
    }
}

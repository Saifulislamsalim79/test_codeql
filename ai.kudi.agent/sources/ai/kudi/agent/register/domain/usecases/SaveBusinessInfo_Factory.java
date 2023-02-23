package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.data.RegistrationRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SaveBusinessInfo_Factory implements InterfaceC9468d<SaveBusinessInfo> {
    private final InterfaceC11700a<RegistrationRepository> registrationRepoProvider;

    public SaveBusinessInfo_Factory(InterfaceC11700a interfaceC11700a) {
        this.registrationRepoProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SaveBusinessInfo_Factory create(InterfaceC11700a interfaceC11700a) {
        SaveBusinessInfo_Factory $r1 = new SaveBusinessInfo_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SaveBusinessInfo newInstance(RegistrationRepository registrationRepository) {
        SaveBusinessInfo $r1 = new SaveBusinessInfo(registrationRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SaveBusinessInfo multiply() {
        InterfaceC11700a $r1 = this.registrationRepoProvider;
        Object $r2 = $r1.get();
        RegistrationRepository $r3 = (RegistrationRepository) $r2;
        SaveBusinessInfo $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40349multiply() {
        SaveBusinessInfo $r1 = multiply();
        return $r1;
    }
}

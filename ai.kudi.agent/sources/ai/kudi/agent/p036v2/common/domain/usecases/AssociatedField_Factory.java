package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.agent.p036v2.common.domain.repositories.AssociatedFieldRepository;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.AssociatedField_Factory */
/* loaded from: classes.dex */
public final class AssociatedField_Factory implements InterfaceC9468d<AssociatedField> {
    private final InterfaceC11700a<AssociatedFieldRepository> associatedFieldRepositoryProvider;

    public AssociatedField_Factory(InterfaceC11700a interfaceC11700a) {
        this.associatedFieldRepositoryProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AssociatedField_Factory create(InterfaceC11700a interfaceC11700a) {
        AssociatedField_Factory $r1 = new AssociatedField_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AssociatedField newInstance(AssociatedFieldRepository associatedFieldRepository) {
        AssociatedField $r1 = new AssociatedField(associatedFieldRepository);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AssociatedField multiply() {
        InterfaceC11700a $r1 = this.associatedFieldRepositoryProvider;
        Object $r2 = $r1.get();
        AssociatedFieldRepository $r3 = (AssociatedFieldRepository) $r2;
        AssociatedField $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41534multiply() {
        AssociatedField $r1 = multiply();
        return $r1;
    }
}

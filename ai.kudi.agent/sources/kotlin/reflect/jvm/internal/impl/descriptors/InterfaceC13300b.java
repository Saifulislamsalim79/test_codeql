package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
/* compiled from: CallableMemberDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b */
/* loaded from: classes3.dex */
public interface InterfaceC13300b extends InterfaceC13293a, InterfaceC13558y {

    /* compiled from: CallableMemberDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b$a */
    /* loaded from: classes3.dex */
    public enum EnumC13301a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: a */
        public boolean m5347a() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: H0 */
    void mo5092H0(Collection<? extends InterfaceC13300b> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    InterfaceC13300b mo4651a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    Collection<? extends InterfaceC13300b> mo4685g();

    /* renamed from: u0 */
    InterfaceC13300b mo5059u0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, EnumC13301a enumC13301a, boolean z);

    /* renamed from: w */
    EnumC13301a mo5057w();
}

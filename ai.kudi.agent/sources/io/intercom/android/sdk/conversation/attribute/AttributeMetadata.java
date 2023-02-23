package io.intercom.android.sdk.conversation.attribute;
/* loaded from: classes.dex */
public abstract class AttributeMetadata {
    public static final AttributeMetadata SINGLE_ATTRIBUTE_METADATA;

    /* loaded from: classes.dex */
    public static final class Builder {
        private int position;
        private int totalCount;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public AttributeMetadata build() {
            int $i0 = this.position;
            int $i1 = this.totalCount;
            AutoValue_AttributeMetadata $r1 = new AutoValue_AttributeMetadata($i0, $i1);
            return $r1;
        }

        public Builder withPosition(int i) {
            this.position = i;
            return this;
        }

        public Builder withTotalCount(int i) {
            this.totalCount = i;
            return this;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Builder $r0 = new Builder();
        AttributeMetadata $r1 = $r0.withPosition(0).withTotalCount(1).build();
        SINGLE_ATTRIBUTE_METADATA = $r1;
    }

    public abstract int getPosition();

    public abstract int getTotalCount();
}

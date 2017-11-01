package delight.log.js;

import delight.async.properties.PropertyNode;
import delight.log.LogsCommon;
import jsinterop.annotations.JsType;
	

@JsType public class JsLogsNode {

    @jsinterop.annotations.JsIgnore
    private PropertyNode node;

    @delight.functional.annotations.ExportedElement public String string(final String id, final String message) {
        return this.node.record(LogsCommon.string(id, message)).get();
    }

    @delight.functional.annotations.ExportedElement public String render() {
        return this.node.render().get();
    }

    @jsinterop.annotations.JsIgnore
    public static final JsLogsNode wrap(final PropertyNode node) {
        final JsLogsNode jsLogsNode = new JsLogsNode();

        jsLogsNode.node = node;

        return jsLogsNode;
    }

    public JsLogsNode() {
        super();
    }

}

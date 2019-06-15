
package com.github.hcsp.objectbasic;
org.junit.jupiter.api.Test;;org.hamcrest.Matchers;;com.github.blindpirate.extensions.CaptureSystemOutput;

class MainTest {

@Test
@CaptureSystemOutput
public void correctMethodInvocation(CaptureSystemOutput.OutputCapture outputCapture) {
    outputCapture.expect(Matchers.containsString("I'm Number!"));
    Main.main(null);
}

}

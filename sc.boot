SuperDirt.start;
MIDIClient.init;


~machineOut = MIDIOut.newByName("IAC Driver","Bus 1");
~machineOut.latency = 0;
~dirt.soundLibrary.addMIDI(\machine,~machineOut);


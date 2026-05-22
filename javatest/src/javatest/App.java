package javatest;

import com.assemblyai.api.AssemblyAI;
import com.assemblyai.api.resources.transcripts.types.*;


public final class App {
    public static <AssemblyAI> void main(String[] args) {
        AssemblyAI client = AssemblyAI.builder()
                .apiKey("YOUR_API_KEY")
                .build();

        String url = "https://storage.googleapis.com/aai-web-samples/5_common_sports_injuries.mp3";

        var params = TranscriptOptionalParams.builder()
                .speakerLabels(true)
                .build();

        Transcript transcript = client.transcripts().transcribe(url, params);

        System.out.println(transcript.getText());

        transcript.getUtterances().ifPresent(utterances ->
            utterances.forEach(utterance ->
                System.out.println("Speaker " + utterance.getSpeaker() + ": " + utterance.getText())
            )
        );
    }
}
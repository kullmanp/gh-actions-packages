FROM gitpod/workspace-full

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && sdk install java 16.0.1.hs-adpt && sdk default java 16.0.1.hs-adpt"
